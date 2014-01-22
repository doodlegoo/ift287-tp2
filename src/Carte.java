
public class Carte implements Comparable<Carte>{

	private String clefId;
	private String titre, equipe, annee;
	
	public Carte(){
		
	}
	
	public String getClefId() {
		return clefId;
	}
	public void setClefId(String clef) {
		clefId = clef;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	@Override
	public int compareTo(Carte n) {
		return n.clefId.compareTo(this.clefId) ;
	}
	public String afficher() {
		String s = "Carte " + clefId + "\n";
		s += "Titre : " + titre + "\n";
		s += "Equipe : " + equipe + "\n";
		s += "Annee de parution : " + annee + "\n";
		return s;
	}

}
