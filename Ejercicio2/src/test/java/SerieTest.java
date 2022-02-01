import org.junit.*;
import org.junit.Test;

public class SerieTest {

	Serie s1 = new Serie("Rick y Morty", 8, "Comedia", "HBO");
	Serie s2 = new Serie("Los Simpsons", 15, "Humor", "Groening");
	Serie s3 = new Serie();

	@Test
	public void testGetTitulo() {
		Assert.assertEquals("Rick y Morty", s1.getTitulo());
	}

	@Test
	public void testSetTitulo() {
		s3.setTitulo("Noticias");
		Assert.assertEquals("Noticias", s3.getTitulo());
	}

	@Test
	public void testGetnumeroTemporadas() {
		Assert.assertEquals(8, s1.getnumeroTemporadas());
	}

	@Test
	public void testSetnumeroTemporadas() {
		s3.setnumeroTemporadas(10);
		Assert.assertEquals(10, s3.getnumeroTemporadas());
	}

	@Test
	public void testGetGenero() {
		Assert.assertEquals("Comedia", s1.getGenero());
	}

	@Test
	public void testSetGenero() {
		s3.setGenero("Informativo");
		Assert.assertEquals("Informativo", s3.getGenero());
	}

	@Test
	public void testGetcreador() {
		Assert.assertEquals("HBO", s1.getcreador());
	}

	@Test
	public void testSetcreador() {
		s3.setcreador("Desconocido");
		Assert.assertEquals("Desconocido", s3.getcreador());
	}

	@Test
	public void testEntregar() {
		s1.entregar();
		Assert.assertEquals(true, s1.isEntregado());
	}

	@Test
	public void testDevolver() {
		s1.devolver();
		Assert.assertEquals(false, s1.isEntregado());
	}

	@Test
	public void testIsEntregado() {
		s1.devolver();
		Assert.assertEquals(false, s1.isEntregado());
	}

	@Test
	public void testCompareTo() {
		Assert.assertEquals(Serie.MAYOR, s2.compareTo(s1));
		Assert.assertEquals(Serie.MENOR, s1.compareTo(s2));
		s3.setnumeroTemporadas(8);
		Assert.assertEquals(Serie.IGUAL, s3.compareTo(s1));
	}

	@Test
	public void testToString() {
		Assert.assertEquals("Informacion de la Serie: \n" + "\tTitulo: " + s1.getTitulo() + "\n" + "\tNumero de temporadas: "
				+ s1.getnumeroTemporadas() + "\n" + "\tGenero: " + s1.getGenero() + "\n" + "\tCreador: "
				+ s1.getcreador(), s1.toString());
	}

	@Test
	public void testEqualsSerie() {
		Assert.assertEquals(false, s1.equals(s2));
		s3.setTitulo("Rick y Morty");
		s3.setcreador("HBO");
		Assert.assertEquals(true, s1.equals(s3));
	}

}