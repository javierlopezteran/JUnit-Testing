package es.iessoterohernandez.daw.endes.Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FridgeTest {

	Fridge nevera;
	private Collection<String> food = new HashSet<String>();

	@BeforeEach
	void setUp() throws Exception {
		nevera = new Fridge();
		food.add("Caracoles");
		food.add("Albondigas");
		food.add("Jamón");
	}

	@Test
	void testPut() {
		nevera.put("Caracoles");
		assertEquals(true, nevera.contains("Caracoles"));
	}

	@Test
	void testContains() {
		nevera.put("Caracoles");
		assertEquals(true, nevera.contains("Caracoles"));
		assertEquals(false, nevera.contains("Jamón"));
	}

	@Test
	void testTake() {
		try {
			nevera.put("Albondigas");
			assertEquals(true, nevera.contains("Albondigas"));
			nevera.take("Albondigas");
			assertEquals(false, nevera.contains("Albondigas"));
		} catch (Exception e) {
			fail("No debe fallar");
		}
	}
	
	@Test
	void testTakeException() {
		try {
			nevera.take("Albondigas");
			fail("No hay en el frigorífico");
		} catch (Exception e) {
			assertEquals(true, e.getMessage().contains("Albondigas"));
		}
	}

}