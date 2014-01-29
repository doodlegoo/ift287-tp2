import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Carte implements Comparable<Carte>{

	private String titre, equipe;
	private int annee;
	
	
	//une solution mais je preferais avoir tout se qui est IO dans une methode autre que le constructeur 
	//surtout quand va venir le temps d'interagir ac une BD
	public Carte(int id){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrez le titre de la carte: ");
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setTitre(s);
		System.out.print("Entrez l'equipe de la carte: ");
		s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setEquipe(s);
		System.out.print("Entrez l'annee de parution de la carte: ");
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
		return 1;
	}
	public String afficher() {
		String s = "\t Titre : " + titre + "\n";
		s += "\t Equipe : " + equipe + "\n";
		s += "\t Annee de parution : " + annee + "\n";
		return s;
	}
	
	public String afficherFichierTexte(){
		String s = ";\"" + titre + "\";\"" + equipe + "\";\"" + annee + "\"";
		return s;
	}

}
