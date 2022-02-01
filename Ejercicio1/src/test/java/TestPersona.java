import org.junit.*;
import org.junit.Test;

public class TestPersona {

	Persona p = new Persona();
	
	@Test
	public void testCalcularIMC() {
        p = new Persona("", 20, 'H', 40, 2.00);
        Assert.assertEquals(-1, p.calcularIMC());
        p = new Persona("", 20, 'H', 150, 2.00);
        Assert.assertEquals(1, p.calcularIMC());
        p = new Persona("", 20, 'H', 80, 2.00);
        Assert.assertEquals(0, p.calcularIMC());
	}

	@Test
	public void testEsMayorDeEdad() {
        p = new Persona("", 20, 'H', 40, 2.00);
        Assert.assertEquals(true, p.esMayorDeEdad());
        p = new Persona("", 16, 'H', 40, 2.00);
        Assert.assertEquals(false, p.esMayorDeEdad());
	}

}
