

public class Joueur implements Comparable<Joueur>{
	
	private String ClefId;
	public String getClefId() {
		return ClefId;
	}
	public void setClefId(String clefId) {
		ClefId = clefId;
	}

	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	private String prenom;
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
		return n.ClefId.compareTo(this.ClefId) ;
	}
}
