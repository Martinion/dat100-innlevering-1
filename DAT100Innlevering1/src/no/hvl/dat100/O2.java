package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	
	private static final int ELEVER = 10;

	public static void run()
	{
		char karakter[] = new char[ELEVER];
		
		for(int i = 0; i < 10; i++)
		{
			karakter[i] = settKarakter(parseInt(showInputDialog("Skriv inn poeng for student " + (i+1))));
			while(karakter[i] == 'x')
				karakter[i] = settKarakter(parseInt(showInputDialog("Skriv inn poeng på nytt for student " + (i+1))));
		}
		
		for(int i = 0; i < ELEVER; i++)
		{
			System.out.println("Student " + (i+1) + " sin karakter er " + karakter[i]);
		}
	}
	
	private static char settKarakter(int a)
	{
		if(a > 100 || a < 0)
		{
			System.out.println("Poeng ikkje gyldig");
			return 'x';
		}
		else if(a >= 90)
		{
			return 'A';
		}
		else if(a >= 80)
		{
			return 'B';
		}
		else if(a >= 60)
		{
			return 'C';
		}
		else if(a >= 50)
		{
			return 'D';
		}
		else if(a >= 40)
		{
			return 'E';
		}
		else
		{
			return 'F';
		}
	}

}
