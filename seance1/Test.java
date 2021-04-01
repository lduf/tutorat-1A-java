public class Test{
	public static void main(String arg[]){
		Etudiant etudiant1 = new Etudiant("toto", "toto_nom", 13, 56); //String prenom, String nom, int numero_etudiant, int classe
		//System.out.println("Prénom de l'étudiant : "+etudiant1.prenom); // nom_de_la_variable.attribut_qu'on_veut_Affficher
		//System.out.println("Numéro de l'étudiant : "+etudiant1.numero_etudiant);

		Etudiant etudiant2 = new Etudiant("toto2", "toto_nom2", 132, 562);

		//System.out.println(etudiant1); //Si on a un toString ça marche bien sinon c'est dégeu

		String affichage_etudiant2 = etudiant2.toString();
		//System.out.println(affichage_etudiant2);

		
		for(int i = 0; i<10; i++){ // on ajoute des notes à notre étudiant
			etudiant1.ajouterNote(10+i,i);
		}
		
		afficherNotes(etudiant1);
		System.out.println("___________");
		etudiant1.afficherNotes();

	}

	public static void afficherNotes(Etudiant etudiant){
		for(int i = 0; i<etudiant.notes.length; i++){
			System.out.println(etudiant.notes[i]);
		}
	}
}