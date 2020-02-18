
public class FizzBuzz {
	public static String fizzBuzz(int numero)
	{
		String fizz = "Fizz";
		String buzz = "Buzz";
		String numeroStr = numero + "";
		if (numero % 3 == 0 && numero % 5 == 0)
		{
			return fizz+buzz;                    
		}
		if(numero % 3 == 0)
		{
			return fizz;
		}
		if(numero % 5 == 0)
		{
			return buzz;
		}
		return numeroStr;
    }	
}
