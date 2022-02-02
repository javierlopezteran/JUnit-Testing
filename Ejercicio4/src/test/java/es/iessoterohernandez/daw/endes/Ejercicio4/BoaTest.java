package es.iessoterohernandez.daw.endes.Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoaTest {

	Boa boa1;
	Boa boa2;

	@BeforeEach
	void setUp() throws Exception {
		boa1 = new Boa("Peter", 3, "carne");
		boa2 = new Boa("Tony", 7, "granola bars");
	}

	@Test
	void testIsHealthy() {
		assertEquals(false, boa1.isHealthy());
		assertEquals(true, boa2.isHealthy());
	}

	@Test
	void testFitsInCage() {
		assertEquals(true, boa1.fitsInCage(4));
		assertEquals(false, boa2.fitsInCage(4));
	}

}