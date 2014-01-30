import java.util.ArrayList;
import java.util.List;

public class JoueurManager {
	//private SortedSet<Joueur> ListJoueur;
	private List<Joueur> ListJoueur;
	JoueurManager()
	{
		ListJoueur = new ArrayList<Joueur>();
	}
	
	public void ajouterJoueur(String id)
	{
		Joueur j = new Joueur(id);
		ListJoueur.add(j);
	}
	
	public void ajouterJoueur(String[] data){
		Joueur j = new Joueur(data);
		ListJoueur.add(j);
	}
	
	public boolean retirerJoueur(Joueur j)
	{
		j.getJeuDeCarte().deleteCarte(j.getPrenom() + " " + j.getNom());
		return ListJoueur.remove(j);
	}
	
	public void modifierJoueur(String id){
		
		ListJoueur.remove(find(id));
		Joueur j = new Joueur(id);
		ListJoueur.add(j);
		
	}
	
	
	//retorune la premiere occurance du Joueur dans la liste
	public Joueur find(String id)
	{
		for(Joueur j : ListJoueur)
		{
			if(id.equals(j.getClefId()))
				return j;
		}
		return null;
	}
	
	public String afficherTout()
	{
		String total = "";
		for(Joueur j : ListJoueur)
		{
			total += "\n" + j.afficherJoueur();
		}
		return total;
	}
	
	public String afficherJoueur(String id)
	{
		Joueur j = find(id);
		if(j != null)
			return j.afficherJoueur();
		else
			return null;
	}
	
	public String afficherInfoFichierTexte(){
		String fichierComplet = "";
		for (Joueur j: ListJoueur) {
			fichierComplet += j.afficherFichierTexte();
		}
		return fichierComplet;
	}
	
	
	
}
