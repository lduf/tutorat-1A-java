
/*
hanoi[0] ==== {3,2,1,0,0}
0(A) :32100 => est fini non / est Vide non c'est pas vide / hauteurTige = 3
1(B) :54000 => est fini non / est Vide non c'est pas vide / hauteurTige = 2  ==> 0
2(C) :00000 => est fini non / est Vide oui c'est  vide / hauteurTige = 0

{{5,4,3,2,1},{0,0,0,0,0},{0,0,0,0,0}} -> résultat de l'intialisation 

*/

public static int[][] creerTours(int n){
	int[][] hanoi = new int[3][n];

	for(int i = n; i<1; i--){
		hanoi[0][n-i] = i;
		hanoi[1][n-i] = 0;
		hanoi[2][n-i] = 0;
	}

	return hanoi;
}

public static boolean estFini(int[][] ma_tour){
	/*
		Le jeu est terminé =>
			tige 1 || 2 on a tous les éléments && la premiere tige est vides

			A est Une tige est vide ? => un tableau avec que des 0

			Vérifier l'ordre dans la tige 
	*/

	// Vérification que A est vide donc A contient que des 0

	// Vérification que B || C contient l'ensemble des disques && dans le bon ordre

			//return True | False (en fonction de l'algo)
}



public static boolean estVide(int tige, int[][] hanoi){

	 // un for pour vérifier que chaque case du tableau hanoi[tige] soit vide 

	int[] ma_tige = hanoi[tige];

	//return 

}


public static int hauteurTige(int tige, int[][] hanoi){
	int[] ma_tige = hanoi[tige];
	int hauteur = 0;

	//on parcourt ma_tige pour compter le nombre de valeur non nulle
	for(int i=0; i<ma_tige.length; i++){
		if(ma_tige[i] != 0){
			hauteur +=1;
		}
		else{ // on a un zéro, on sait qu'on aura que des 0 après
			return hauteur;
		}
	}
	return hauteur;
}


public static boolean deplacerDisque(int[][] hanoi, int nTD,int nTA){
	// i)  retire un disque de la tige numérotée nTD pour l’enfiler sur la tige numérotée nTA si le déplacement est conforme
		// - retirer un disque (2)
		// - vérifier la conformité (1)

	// Un déplacement conforme ?
	// Celui le plus en hauteur de la pile ()
	// Vérifier les largeurs des disques (on ne peut pas mettre un disque plus gros sur un petit)
	// La tige de départ n'est pas vide DONE

	// Tige départ non vide 
	if(estVide(nTD, hanoi)){
		return false;
	}

	// Tige départ non vide 
	if(estVide(nTA, hanoi)){
		//on a le droit de faire un déplacement 
		//DEPLACEMENT
		//on remplace la valeur la plus en haut du dsique d'arrivée par valeur la plus en bas de la valeur d'arrivée
		hanoi[nTA][hauteurTige(nTA, hanoi)] = valeur_disque_depart; // 4 <=> 1 
		// Il faut penser à supprimer le 1 
		hanoi[nTD][hauteurTige(nTD, hanoi)-1] = 0;
	}
	else{
		// Vérifier la largeur des disques
		// voir les numéros des diques
		int valeur_disque_depart = hanoi[nTD][hauteurTige(nTD, hanoi)-1];// 1 // donne la valeur du disque que l'on dépile dans la tige de départ
		int valeur_disque_arrivee = hanoi[nTA][hauteurTige(nTA, hanoi)-1];// 3
		if(valeur_disque_arrivee > valeur_disque_depart){
			//DEPLACEMENT
			//on remplace la valeur la plus en haut du dsique d'arrivée par valeur la plus en bas de la valeur d'arrivée
			hanoi[nTA][hauteurTige(nTA, hanoi)] = valeur_disque_depart; // 4 <=> 1 
			// Il faut penser à supprimer le 1 
			hanoi[nTD][hauteurTige(nTD, hanoi)-1] = 0;
		}
		else{
			return false;
		}
	}
	return true; 
}

// SANS DUPLICATION DE CODE

// Tige départ non vide 
	
		// Vérifier la largeur des disques
		// voir les numéros des diques
		int valeur_disque_depart = hanoi[nTD][hauteurTige(nTD, hanoi)-1];// 1 // donne la valeur du disque que l'on dépile dans la tige de départ
		int valeur_disque_arrivee = 0;
		if(!estVide(nTA, hanoi)){
			valeur_disque_arrivee = hanoi[nTA][hauteurTige(nTA, hanoi)-1];// 3
		}
		if(estVide(nTA, hanoi) || valeur_disque_arrivee > valeur_disque_depart){ // (0 > 3) ? NON -> pas de déplacement
			//on remplace la valeur la plus en haut du dsique d'arrivée par valeur la plus en bas de la valeur d'arrivée
			 hanoi[nTA][hauteurTige(nTA, hanoi)] = valeur_disque_depart; // 4 <=> 1 
			 // Il faut penser à supprimer le 1 
			 hanoi[nTD][hauteurTige(nTD, hanoi)-1] = 0;
		}
		else{
			return false;
		}
	








