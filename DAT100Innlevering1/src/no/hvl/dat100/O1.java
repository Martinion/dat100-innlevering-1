package no.hvl.dat100;

public class O1 {
	public static int trinnSkatt(int lønn)
	{
		lønn *= 100;
		int trinn0 = 20805000;
		int trinn1 = 29285000;
		int trinn2 = 67000000;
		int trinn3 = 93790000;
		int trinn4 = 135000000;
		float trinn1rente = 0.017f;
		float trinn2rente = 0.040f;
		float trinn3rente = 0.136f;
		float trinn4rente = 0.166f;
		float trinn5rente = 0.176f;
		int skatt = 0;
		
		if(lønn > trinn4)
		{
			skatt += (lønn-trinn4) * trinn5rente;
			lønn = trinn4;
		}
		if(lønn > trinn3)
		{
			skatt += (lønn-trinn3) * trinn4rente;
			lønn = trinn3;
		}
		if(lønn > trinn2)
		{
			skatt += (lønn-trinn2) * trinn3rente;
			lønn = trinn2;
		}
		if(lønn > trinn1)
		{
			skatt += (lønn-trinn1) * trinn2rente;
			lønn = trinn1;
		}
		if(lønn > trinn0)
		{
			skatt += (lønn-trinn0) * trinn1rente;
		}
		
		return (skatt+50)/100;
	}
}
