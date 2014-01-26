import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Carte implements Comparable<Carte>{

	private int clefId;
	private String titre, equipe;
	private int annee;
	
	
	//une solution mais je preferais avoir tout se qui est IO dans une methode autre que le constructeur 
	//surtout quand va venir le temps d'interagir ac une BD
	public Carte(int id){
		clefId = id;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrez le titre de la carte "+clefId +" : ");
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setTitre(s);
		System.out.print("Entrez l'equipe de la carte  "+clefId +" : ");
		s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setEquipe(s);
		System.out.print("Entrez l'annee de parution de la carte "+clefId +" : ");
		s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setEquipe(s);
	}
	
	public Carte(String titre, String equipe, int annee)
	{
		setEquipe(equipe);
		setTitre(titre);
		setAnnee(annee);
	}
	
	public int getClefId() {
		return clefId;
	}
	public void setClefId(int clef) {
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

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	//doit retourner un int negatif ou positif selon si this est plus grand
	@Override
	public int compareTo(Carte n) {
		if( n.clefId == this.clefId)
			return 0;
		if( n.clefId < this.clefId)
			return -1;
		return 1;
	}
	public String afficher() {
		String s = "Carte " + clefId + "\n";
		s += "Titre : " + titre + "\n";
		s += "Equipe : " + equipe + "\n";
		s += "Annee de parution : " + annee + "\n";
		return s;
	}
	
	public String afficherFichierTexte(){
		String s = ";\"" + titre + "\";\"" + equipe + "\";\"" + annee + "\"";
		return s;
	}

}
