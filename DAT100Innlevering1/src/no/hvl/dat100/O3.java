package no.hvl.dat100;
import java.math.BigInteger;

public class O3 
{
	public static BigInteger fakultet(int n)
	{
		BigInteger temp = new BigInteger("1");
		
		for(int i = n; i > 0; i--)
		{
			temp = temp.multiply(new BigInteger(String.valueOf(i)));
		}
		return temp;
	}
}
