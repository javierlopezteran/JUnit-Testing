import org.junit.*;

import org.junit.Test;

public class VideojuegoTest {

	Videojuego v1 = new Videojuego("Kingdom Hearts", 200, "Rol", "SquareEnix");
	Videojuego v2 = new Videojuego("Bandicoot", 100, "Plataforma", "Desconocido");
	Videojuego v3 = new Videojuego();

	

	@Test
	public void testGetTitulo() {

		Assert.assertEquals("Kingdom Hearts", v1.getTitulo());
	}

	@Test
	public void testSetTitulo() {

		v3.setTitulo("FIFA");
		Assert.assertEquals("FIFA", v3.getTitulo());
	}

	@Test
	public void testGetHorasEstimadas() {

		Assert.assertEquals(200, v1.getHorasEstimadas());
	}

	@Test
	public void testSetHorasEstimadas() {

		v3.setHorasEstimadas(200);
		Assert.assertEquals(200, v3.getHorasEstimadas());
	}

	@Test
	public void testGetGenero() {

		Assert.assertEquals("Rol", v1.getGenero());
	}

	@Test
	public void testSetGenero() {

		v3.setGenero("Infantil");
		Assert.assertEquals("Infantil", v3.getGenero());
	}

	@Test
	public void testGetcompañia() {

		Assert.assertEquals("SquareEnix", v1.getcompañia());
	}

	@Test
	public void testSetcompañia() {

		v3.setcompañia("EA");
		Assert.assertEquals("EA", v3.getcompañia());
	}

	@Test
	public void testEntregar() {

		v1.entregar();
		Assert.assertEquals(true, v1.isEntregado());
	}

	@Test
	public void testDevolver() {

		v1.devolver();
		Assert.assertEquals(false, v1.isEntregado());
	}

	@Test
	public void testIsEntregado() {

		v1.devolver();
		Assert.assertEquals(false, v1.isEntregado());
	}

	@Test
	public void testCompareTo() {

		Assert.assertEquals(Serie.MAYOR, v1.compareTo(v2));
		Assert.assertEquals(Serie.MENOR, v2.compareTo(v1));
		v3.setHorasEstimadas(200);
		Assert.assertEquals(Serie.IGUAL, v3.compareTo(v1));
	}

	@Test
	public void testToString() {

		Assert.assertEquals("Informacion del videojuego: \n" + "\tTitulo: " + v1.getTitulo() + "\n" + "\tHoras estimadas: "
				+ v1.getHorasEstimadas() + "\n" + "\tGenero: " + v1.getGenero() + "\n" + "\tcompañia: "
				+ v1.getcompañia(), v1.toString());
	}

	@Test
	public void testEquals() {

		Assert.assertEquals(false, v1.equals(v2));
		v3.setTitulo("Kingdom Hearts");
		v3.setcompañia("SquareEnix");
		Assert.assertEquals(true, v1.equals(v3));
	}
}