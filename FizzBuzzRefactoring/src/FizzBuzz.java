
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
		else 
			if(numero % 3 == 0)
			{
				return fizz;
			}
			else 
				if(numero % 5 == 0)
				{
					return buzz;
				}
				else
					return numeroStr;
    }	
}
