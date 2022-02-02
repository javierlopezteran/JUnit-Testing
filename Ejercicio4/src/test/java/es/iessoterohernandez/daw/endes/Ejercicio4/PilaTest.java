package es.iessoterohernandez.daw.endes.Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {

	

	Pila p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Pila();
	}

	@Test
	void testPush() {
		p.push(1);
		assertEquals(true, p.isEmpty());
		p.push(10);
		assertEquals(false, p.isEmpty());
	}

	@Test
	void testPop() {
		assertEquals(null, p.pop());

		p.push(3);
		p.push(4);
		p.push(5);

		assertEquals(5, p.pop());
		assertEquals(4, p.pop());
		assertEquals(3, p.pop());

	}

	@Test
	void testIsEmpty() {
		assertEquals(true, p.isEmpty());

		p.push(10);
		assertEquals(false, p.isEmpty());
	}

	@Test
	void testTop() {
		assertEquals(null, p.top());

		p.push(3);
		p.push(4);
		p.push(5);

		assertEquals(5, p.top());
	}

}