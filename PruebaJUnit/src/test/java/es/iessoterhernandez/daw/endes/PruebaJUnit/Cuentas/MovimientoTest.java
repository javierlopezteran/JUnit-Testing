package es.iessoterhernandez.daw.endes.PruebaJUnit.Cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MovimientoTest {
	Movimiento m;
	
	@BeforeEach
	void setUp(){
		m=new Movimiento();
		m.mImporte=100;
		m.mConcepto="Concepto";
	}

	@Test
	void testGetImporte() {
		assertEquals(100,m.getImporte());
	}

	@Test
	void testGetConcepto() {
		assertEquals("Concepto",m.getConcepto());
	}

	@Test
	void testSetConcepto() {
		fail("Not yet implemented");
	}

	@Test
	void testSetImporte() {
		fail("Not yet implemented");
	}

}
