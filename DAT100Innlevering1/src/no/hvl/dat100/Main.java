package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Main {

	public static void main(String[] args) {
		
		System.out.printf("%,.2f \n", O1.trinnSkatt(parseInt(showInputDialog("Skriv inn inntekt"))));
		O2.run();
		System.out.print(O3.fakultet(parseInt(showInputDialog("Skriv inn eit tall"))));	
	}

}
