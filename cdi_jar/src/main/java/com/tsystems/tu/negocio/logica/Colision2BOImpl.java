package com.tsystems.tu.negocio.logica;

import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

import com.tsystems.tu.negocio.objetos.AbstractVehiculo;

/**
 * Clase de negocio de gestión de colisiones.
 * 
 * @author krequena
 *
 */
@Default
public class Colision2BOImpl implements ColisionBO {

	/**
	 * Constructor.
	 */
	public Colision2BOImpl() {

	}

	/**
	 * Método que obtiene la cantidad total de ruedas de los vehículos implicados en
	 * una colisión.
	 * 
	 * @param implicados Lista de implicados.
	 * @return Cantidad de ruedas.
	 */
	public int contarRuedas(final List<AbstractVehiculo> implicados) {
		// Acumulador.
		int ruedas = 0;

		// Precondición.
		if (implicados != null) {
			// Iteración de conteo.
			for (AbstractVehiculo implicado : implicados) {
				ruedas = ruedas + implicado.getRuedas();
			}
		}

		return ruedas;
	}

	/**
	 * Método que obtiene la cantidad total de puertas de los vehículos implicados
	 * en una colisión.
	 * 
	 * @param implicados Lista de implicados.
	 * @return Cantidad de puertas.
	 */
	public int contarPuertas(final List<AbstractVehiculo> implicados) {
		// Precondición.
		if (implicados != null) {
			return implicados.stream().mapToInt(implicado -> implicado.getPuertas()).sum();
		} else {
			return 0;
		}
	}

}
