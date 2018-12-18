package com.tsystems.tu.negocio.logica.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tsystems.tu.negocio.logica.ColisionBOImpl;
import com.tsystems.tu.negocio.objetos.AbstractVehiculo;
import com.tsystems.tu.negocio.objetos.Coche;
import com.tsystems.tu.negocio.objetos.Motocicleta;

/**
 * Clase de test de la clase ColisionBO.
 * @author krequena
 *
 */
public class ColisionBOTest {

	// Objeto de negocio a testear.

	private ColisionBOImpl colisionBO;

	private List<AbstractVehiculo> vehiculos;

	/**
	 * Método de inicialización.
	 */
	@Before
	public void inicializacion() {
		// Creación de datos de test.
		AbstractVehiculo coche1 = new Coche(5);
		AbstractVehiculo coche2 = new Coche(2);
		AbstractVehiculo motocicleta1 = new Motocicleta();
		AbstractVehiculo motocicleta2 = new Motocicleta();
		vehiculos = new ArrayList<>();
		vehiculos.add(coche1);
		vehiculos.add(coche2);
		vehiculos.add(motocicleta1);
		vehiculos.add(motocicleta2);

		// Crear la instancia del objeto de negocio.
		// Probad: ¿Qué ocurre si lo intento inyectar con CDI?
		// ¿Cuándo se ejecutan los tests?
		this.colisionBO = new ColisionBOImpl();
	}

	/**
	 * Método de destrucción.
	 */
	@After
	public void destruccion() {
		this.colisionBO = null;
	}

	/**
	 * Método de test de la operación getPuertas().
	 */
	@Test
	public void testGetPuertas() {
		assertEquals(7, this.colisionBO.contarPuertas(this.vehiculos));
	}

	/**
	 * Método de test de la operación getRuedas().
	 */
	@Test
	public void testGetRuedas() {
		assertEquals(12, this.colisionBO.contarRuedas(this.vehiculos));
	}
}
