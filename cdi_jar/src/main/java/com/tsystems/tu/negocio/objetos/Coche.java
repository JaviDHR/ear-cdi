package com.tsystems.tu.negocio.objetos;

/**
 * Clase de vehículo Coche.
 * @author krequena
 *
 */

public class Coche extends AbstractVehiculo {

	// Constantes.
	private final static int RUEDAS_COCHE = 4;
	
	/**
	 * Constructor.
	 * @param puertas Puertas del coche.
	 */
	public Coche(final int puertas) {
		super.setPuertas(puertas);
		super.setRuedas(Coche.RUEDAS_COCHE);
	}

}
