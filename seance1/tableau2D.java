public class tableau2D{
	public static void main(String arg[]){
		int TAILLE = 10;
		int[][] mon_tableau = new int[TAILLE][TAILLE];
		double[][] mon_tableau_de_double = new double[TAILLE][TAILLE-5];
		String[][] mon_tableau_de_string = {
			{"Coucou", "ceci", "est"}, 
			{"un", "tableau", "de"}, 
			{"string","avec un", "sous tableau"}
		};

		int[][] int_array = {
			{1,2,3,4,5},
			{11,12,13,14,15},
			{21,22,23,24,25}
		};

		/*
				0	1	2	3	4
			0 	1	2	3	4	5
			1	11	12	13	14	15
			2	21	22	23	24	25
		*/
		System.out.println(int_array.length); // 3
		System.out.println(int_array[1].length); // 3

		for(int i=0; i<int_array.length; i++){
			for (int j = 0; j<int_array[i].length ; j++) { //5
				
			}
		 // System.out.println("Element à l'index "+i+" : "+int_array[i]);
		}

	}
}