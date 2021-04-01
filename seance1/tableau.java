public class tableau{
	public static void main(String arg[]){
		int TAILLE = 10;
		int[] mon_tableau = new int[TAILLE];
		double[] mon_tableau_de_double = new double[TAILLE];
		String[] mon_tableau_de_string = {"Coucou", "ceci", "est", "un", "tableau", "de", "string"};

		int[] int_array = {12,32,45,128};
		for(int i=0; i<int_array.length; i++){
		  System.out.println("Element à l'index "+i+" : "+int_array[i]);
		}

	}
}