import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Joueur implements Comparable<Joueur>{
	
	private String clefId;
	private String nom;
	private String prenom;
	private int nbCarte;
	private JeuDeCarte jeuDeCarte;
	
	public int getNbCarte() {
		return nbCarte;
	}
	public void setNbCarte(int nbCarte) {
		this.nbCarte = nbCarte;
	}
	public String getClefId() {
		return clefId;
	}
	public void setClefId(String clef) {
		clefId = clef;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public Joueur()
	{
		
	}
	
	@Override
	public int compareTo(Joueur n) {
		return n.clefId.compareTo(this.clefId) ;
	}
	
	public void afficherJoueur() {
		System.out.println("Option selectionne: 2. Afficher l'information d'un joueur");
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrez la clé d'identification du joueur: ");
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Voici l'information sauvegarde de: "+ getPrenom()+" " +getNom() );
		System.out.println("Le joueur a "+ getNbCarte() +" cartes enregistre");
		
		System.out.println(jeuDeCarte/*.afficher()*/);
		
	}
	
}
