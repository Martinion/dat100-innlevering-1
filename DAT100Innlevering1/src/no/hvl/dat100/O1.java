package no.hvl.dat100;

public class O1 {
	private static final int TRINN0 = 208050000;
	private static final int TRINN1 = 292850000;
	private static final int TRINN2 = 670000000;
	private static final int TRINN3 = 937900000;
	private static final int TRINN4 = 1350000000;
	private static final float TRINN1RENTE = 0.017f;
	private static final float TRINN2RENTE = 0.040f;
	private static final float TRINN3RENTE = 0.136f;
	private static final float TRINN4RENTE = 0.166f;
	private static final float TRINN5RENTE = 0.176f;

	
	public static float trinnSkatt(long lønn)
	{
		int skatt = 0;
		lønn *= 1000;
		
		if(lønn > TRINN4)
		{
			skatt += (lønn-TRINN4) * TRINN5RENTE;
			lønn = TRINN4;
		}
		if(lønn > TRINN3)
		{
			skatt += (lønn-TRINN3) * TRINN4RENTE;
			lønn = TRINN3;
		}
		if(lønn > TRINN2)
		{
			skatt += (lønn-TRINN2) * TRINN3RENTE;
			lønn = TRINN2;
		}
		if(lønn > TRINN1)
		{
			skatt += (lønn-TRINN1) * TRINN2RENTE;
			lønn = TRINN1;
		}
		if(lønn > TRINN0)
		{
			skatt += (lønn-TRINN0) * TRINN1RENTE;
		}
		
		return skatt/1000.0f;
	}
}
