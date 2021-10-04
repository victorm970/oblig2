package Matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int y[]: matrise) {
			for (int x: y) {
				System.out.print(x);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String output = "";
		
		for (int y[]: matrise) {
			for (int x: y) {
				output += (x + " ");
				
			}
			output += "\n";
			
		}
		System.out.println(output);
		return output;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int nymatrise [][] = new int [matrise.length][matrise[0].length];
		
		for ( int y = 0; y < matrise.length; y++) 
			for (int x = 0; x < matrise[y].length; x++) 
				nymatrise[y][x] = matrise [y][x]* tall;
			
		return nymatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true; 
		int rad1, rad2, kol1, kol2;
		
		rad1 = a.length;
		kol1 = a[0].length;
		
		rad2 = b.length;
		kol2 = b[0].length;
		
			if (rad1 != rad2 || kol1 != kol2) {
				lik = false;
			}
			else {
				for (int i = 0; i < rad1; i++) {
					for (int j = 0; j < kol1; j++) {
						if(a[i][j] != b[i][j]) {
							lik = false;
							break;
						}
					}
				}
				if (lik)
					lik= true;
				else
					lik = false;
			}
		
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int [][] speiletmatrise = new int [matrise.length][matrise[0].length] ; 
		int x = 0;                                                              
		for (int i = 0; i < matrise.length; i++) {                               
			
			int y = 0; 															
			while (y < matrise[i].length) { 									 
				speiletmatrise[i][y] = matrise[y][x];							
				y++;   																
			}
			x++;	
		} 
		return speiletmatrise; 
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int multiplisert [][] = new int [a.length][b[0].length];      
		
		if (a[0].length == b.length) {              			       
			for (int i = 0; i < a.length; i++) {      			       
				for (int j= 0; j< b[0].length; j++) {   		       
					multiplisert[i][j] = 0;  					 
					for (int k = 0 ; k < a[0].length; k++) {   		
						multiplisert [i] [j]  += a[i][k] * b [k] [j];   
					}
					
				}
			}
		}
		return multiplisert;
	
	}
}
