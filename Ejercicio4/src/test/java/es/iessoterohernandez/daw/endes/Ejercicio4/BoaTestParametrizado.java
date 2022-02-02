package es.iessoterohernandez.daw.endes.Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BoaTestParametrizado {

	Boa boa1;
	Boa boa2;

	@BeforeEach
	void setUp() throws Exception {
		boa1 = new Boa("Peter", 3, "carne");
		boa2 = new Boa("Tony", 7, "granola bars");
	}

	@ParameterizedTest(name = "Test IsHealthy")
	@CsvSource({
			"Peter1,    	 3,   cocido,   	  false",
			"Tony1,    7,   granola bars,   true",
			"Peter2,        3,   cocido,        false",
			"Tony2,    7,   cocido,      false",
			"Peter3,        3,   granola bars,   true",
			"Tony3,    7,   cocido,        false",
			"Peter4,        3,   cocido,        false",
			"Tony4,    7,   granola bars,   true"
			
	})
	
	void testIsHealthy1(String nombre,int medidas,String comida, boolean expectedResult) throws Exception {
		boa1 = new Boa(nombre,medidas,comida);
		
		assertEquals(expectedResult, boa1.isHealthy());
	}
	

	@ParameterizedTest(name = "Test FitsInCage")
	@CsvSource({
			"Peter,    	3,    4,     carne,    true",
			"Tony,    7,   4,   granola bars,   false"
			
	})
	void testFitsInCage2(String nombre,int medidas,int cageLength,String comida, boolean expectedResult) throws Exception {
		boa1 = new Boa(nombre,medidas,comida);
		
		assertEquals(expectedResult, boa1.fitsInCage(cageLength));
	}

}