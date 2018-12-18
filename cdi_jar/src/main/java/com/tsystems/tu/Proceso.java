package com.tsystems.tu;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tsystems.tu.negocio.logica.ColisionBO;
import com.tsystems.tu.negocio.objetos.AbstractVehiculo;
import com.tsystems.tu.negocio.objetos.Coche;
import com.tsystems.tu.negocio.objetos.Motocicleta;

/**
 * Clase de procesamiento.
 * @author krequena
 *
 */
public class Proceso {

	// Objeto logger.
	private static final Logger LOG = LogManager.getLogger();

	@Inject
	private ColisionBO colisionBO;

	/**
	 * Método que ejecuta el negocio.
	 */
	public void procesar() {
		// Creación de vehículos.
		AbstractVehiculo coche = new Coche(5);
		AbstractVehiculo motocicleta = new Motocicleta();

		// Creación de lista de vehículos.
		List<AbstractVehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(coche);
		vehiculos.add(motocicleta);

		// Uso del objeto de negocio de colisiones inyectado.
		final int puertas = this.colisionBO.contarPuertas(vehiculos);
		final int ruedas = this.colisionBO.contarRuedas(vehiculos);

		LOG.info("Resultado de la colisión: {} puertas, {} ruedas.", puertas, ruedas);
	}
}
