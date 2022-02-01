package es.iessoterhernandez.daw.endes.Ejercicio3Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	Product p;
	ShoppingCart sc;

	@BeforeEach
	void setUp() throws Exception {
		p = new Product("Cuenco", 40.5);
		sc = new ShoppingCart();
		sc.addItem(p);
	}

	@Test
	void testGetBalance() {
		assertEquals(40.5, sc.getBalance());

	}

	@Test
	void testAddItem() {
		Product p2 = new Product("Bol", 43.95);
		sc.addItem(p2);

		double precioTotal = p.getPrice() + p2.getPrice();
		assertEquals(precioTotal, sc.getBalance());

		assertEquals(2, sc.getItemCount());
	}

	@Test
	void testRemoveItem() {
		try {
			sc.removeItem(p);

			assertEquals(0, sc.getItemCount());

			assertEquals(0.0, sc.getBalance());

		} catch (Exception e) {
			fail("No debería fallar");
		}
	}

	@Test
	void testProductNotFound() {

		try {

			Product p3 = new Product("Taza", 4.95);
			sc.removeItem(p3);

		} catch (Exception e) {
			fail("No se ha encontrado este producto");
		}
	}

	@Test
	void testGetItemCount() {
		assertEquals(1, sc.getItemCount());
	}

	@Test
	void testEmpty() {
		sc.empty();
		assertEquals(0, sc.getItemCount());
	}

}