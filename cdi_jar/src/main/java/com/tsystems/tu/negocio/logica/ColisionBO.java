package com.tsystems.tu.negocio.logica;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import com.tsystems.tu.negocio.objetos.AbstractVehiculo;

/**
 * Interfaz de negocio de gestión de colisiones.
 * 
 * @author krequena
 *
 */
@Local
public interface ColisionBO {

	/**
	 * Método que obtiene la cantidad total de ruedas de los vehículos implicados en
	 * una colisión.
	 * 
	 * @param implicados Lista de implicados.
	 * @return Cantidad de ruedas.
	 */
	int contarRuedas(final List<AbstractVehiculo> implicados);

	/**
	 * Método que obtiene la cantidad total de puertas de los vehículos implicados
	 * en una colisión.
	 * 
	 * @param implicados Lista de implicados.
	 * @return Cantidad de puertas.
	 */
	int contarPuertas(final List<AbstractVehiculo> implicados);

}
