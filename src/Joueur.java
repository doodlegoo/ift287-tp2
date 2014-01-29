import java.util.Arrays;

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
		
		String nomComplet = Interaction.IOJoueurNom();
		String[] nomArray = nomComplet.split(" ");
		setPrenom(nomArray[0]);
		setNom(nomArray[1]);
		
		int i = Interaction.IOnbCartes();
		setNbCarte(i);
		for(int k = 1; k<=i;k++){
			jeuDeCarte.ajouter(k);
		}
	}
	
	public Joueur(String[] data){
		jeuDeCarte = new JeuDeCarte();
		setClefId(data[0]);
		String[] nom = data[1].split(" ");
		setPrenom(nom[0]); 
		setNom(nom[1]);
		setNbCarte(Integer.parseInt(data[2]));
		String[] infoCarte = Arrays.copyOfRange(data, 3, data.length);
		for(int i = 0; i < infoCarte.length - 1; ++i){
			jeuDeCarte.ajouter(infoCarte[i], infoCarte[i+1], Integer.parseInt(infoCarte[i+2]));
			i += 2;
		}
	}
	
	@Override
	public int compareTo(Joueur n) {
		return n.clefId.compareTo(this.clefId) ;
	}
	
	public String afficherJoueur() {
		String s = "Voici l'information sauvegarde de: "+ getPrenom()+" " +getNom() + "\n" ;
		s +=  jeuDeCarte.afficherTout();
		return s;
	}
	public String afficherFichierTexte(){
		String s = "";
		s += "\"" + getClefId() + "\";\"" + getPrenom() + " " + getNom() + "\";\"" + getNbCarte() + "\"";
		s += jeuDeCarte.afficherFichierTexte() + "\n";
		return s;
	}
	
}
