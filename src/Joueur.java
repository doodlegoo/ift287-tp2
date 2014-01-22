import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Joueur implements Comparable<Joueur>{
	
	private String clefId;
	private String nom;
	private String prenom;
	private int nbCarte;
	private JeuDeCarte jeuDeCarte;
	
	public JeuDeCarte getJeuDeCarte() {
		return jeuDeCarte;
	}
	public void setJeuDeCarte(JeuDeCarte jeuDeCarte) {
		this.jeuDeCarte = jeuDeCarte;
	}
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

	
	public Joueur(String id)
	{
		jeuDeCarte = new JeuDeCarte();
		clefId = id;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrez le prenom du joueur: ");
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setPrenom(s);
		setNom("rodrigue");
		
		System.out.println("Combien de cartes?");
		int i=0;
		try {
			s = br.readLine();
			i = Integer.parseInt(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setNbCarte(i);
		for(int k = 1; k<=i;k++){
			jeuDeCarte.ajouter(k);
		}
	}
	
	@Override
	public int compareTo(Joueur n) {
		return n.clefId.compareTo(this.clefId) ;
	}
	
	public String afficherJoueur() {
		String s = "Voici l'information sauvegarde de: "+ getPrenom()+" " +getNom() ;
		s +=  jeuDeCarte.afficherTout();
		return s;
	}
	
}
