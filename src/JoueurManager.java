import java.util.ArrayList;
import java.util.List;

public class JoueurManager {
	//private SortedSet<Joueur> ListJoueur;
	private List<Joueur> ListJoueur;
	JoueurManager()
	{
		ListJoueur = new ArrayList<Joueur>();
	}
	
	public void ajouterJoueur(String s)
	{
		Joueur j = new Joueur(s);
		ListJoueur.add(j);
	}
	
	public void ajouterJoueur(String[] data){
		Joueur j = new Joueur(data);
		ListJoueur.add(j);
	}
	
	public boolean retirerJoueur(Joueur j)
	{
		return ListJoueur.remove(j);
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
	
	//trouver le joueur a modifier
	public boolean modifier(String NomJoueur)
	{
		for(Joueur j : ListJoueur)
		{
			if((j.getPrenom() + " " + j.getNom() == NomJoueur))
			{
				//do some magic! 
			}
		}
		return false;
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
		return find(id).afficherJoueur();
	}
	
	public String afficherInfoFichierTexte(){
		String fichierComplet = "";
		for (Joueur j: ListJoueur) {
			fichierComplet += j.afficherFichierTexte();
		}
		return fichierComplet;
	}
}
