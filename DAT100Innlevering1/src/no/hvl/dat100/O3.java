package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 
{
	public static int fakultet(int n)
	{
		int temp = 1;
		
		for(int i = n; i > 0; i--)
		{
			temp *= i;
		}
		return temp;
	}
}
