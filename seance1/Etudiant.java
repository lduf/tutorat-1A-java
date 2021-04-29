public class Etudiant{
	
	// les attributs
	String prenom;
	String nom;
	int numero_etudiant;
	int classe;
	int[] notes = new int[10];

	//constructeur
	public Etudiant(String prenom, String nom, int numero_etudiant, int classe){
		this.prenom = prenom; //this sous entendu 'dans cette classe (java)'
		this.nom = nom;
		this.numero_etudiant = numero_etudiant;
		this.classe = classe;
	}

	public String toString(){
		String str = " Etudiant N° "+this.numero_etudiant+" \n "+"Prenom : "+this.prenom+" \n "+"Nom : "+this.nom+" \n "+"Classe : "+this.classe;
		return str;
	}

	public void ajouterNote(int note, int index){
		this.notes[index]= note;
	}

	public void afficherNotes(){
		for(int i = 0; i<this.notes.length; i++){
			System.out.println(this.notes[i]);
		}
	}
}