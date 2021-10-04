package Tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) { 
			System.out.println("Tall " + (i + 1) + ": " + tabell[i]);

		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String output = "["; 

		for (int i = 0; i < tabell.length; i++) {   
													
			if (i == tabell.length - 1) {           
											        
				output += tabell[i];                
			} else {
				output += (tabell[i] + ",");
			}                                       

		}
		output += "]";							    

													
		return output; 	
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int counter = 0; counter < tabell.length; counter++) {
			sum += tabell[counter];
		}
		

		return sum;
		
		/*
		 * // ved hjelp av while.

		int sum = 0;
		int index = 0;

		while (index < tabell.length) {
			sum += tabell[index];
			index++;
		}
		return sum;
		 * 
		 * 
		 * // ved hjelp av utvidet for løkke.

		int sum = 0;
		for (int i : tabell) {
			sum += i;
		}
		return sum;
		 */
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean inneholdt = false;

		for (int i : tabell) {
			if (i == tall) {
				inneholdt = true;
				break;
			}
		}
		
		return inneholdt;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int posisjon = -1; 
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				posisjon = i;
				break;
			}
		}
		
		return posisjon;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int index = tabell.length - 1;
		int[] motsattrekkefølge = new int[tabell.length]; 
															

		for (int i = 0; i < tabell.length; i++) {
			motsattrekkefølge[i] = tabell[index]; 
													
			index--;
		}

		for (int num : motsattrekkefølge) {
			System.out.print(num);
		}

		return motsattrekkefølge;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;

		for (int i = 0; i < tabell.length - 1; i++) { 
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
				break;
			}
		}
		
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nytabell = new int[tabell1.length+tabell2.length];

		
		for (int i = 0; i < tabell1.length; i++) {
			nytabell[i] = tabell1[i]; 
		}
		
		for (int j = tabell1.length; j < nytabell.length; j++ ) {
			nytabell[j] = tabell2[j-tabell1.length];
			
		}
		for (int num : nytabell ) {
		System.out.println(num);}
		
		return nytabell ;
	}
}
