package es.iessoterhernandez.daw.endes.PruebaJUnit.Cuentas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	String mNumero;
	String mTitular;
	Vector mMovimientos;
	
	@BeforeEach
	public void init() {
		mNumero="123";
		mTitular="Pepe";
		mMovimientos=new Vector();	
	}

	@Test
	void testCuenta() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresar() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirar() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	void testAddMovimiento() {
		fail("Not yet implemented");
	}

}
