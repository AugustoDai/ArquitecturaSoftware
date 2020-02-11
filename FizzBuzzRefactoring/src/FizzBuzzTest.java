import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	public void testNumber1() {
		String resultado = FizzBuzz.fizzBuzz(1);
		String esperado = "1";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testNumber3() {
		String resultado = FizzBuzz.fizzBuzz(3);
		String esperado = "Fizz";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testNumber5() {
		String resultado = FizzBuzz.fizzBuzz(5);
		String esperado = "Buzz";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testNumber15() {
		String resultado = FizzBuzz.fizzBuzz(15);
		String esperado = "FizzBuzz";
		assertEquals(esperado, resultado);
	}

}
