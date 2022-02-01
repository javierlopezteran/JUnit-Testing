package es.iessoterhernandez.daw.endes.Ejercicio3Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

	Product p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Product("Cajón", 60.5);
	}


	@Test
	void testGetTitle() {
		assertEquals("Cajón", p.getTitle());
	}

	@Test
	void testGetPrice() {
		assertEquals(60.5, p.getPrice());
	}

	@Test
	void testEqualsObject() {
		assertEquals(true,p.equals(p));
		Product p2=new Product("Litera",200);
		assertEquals(false,p.equals(p2));
	}

}