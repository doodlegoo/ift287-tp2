import java.util.SortedSet;
import java.util.TreeSet;

public class JoueurManager {
	private SortedSet<Joueur> ListJoueur;
	
	JoueurManager()
	{
		ListJoueur = new TreeSet<Joueur>();
	}
	
	public void ajouterJoueur(Joueur j)
	{
		ListJoueur.add(j);
	}
	
	public void retirerJoueur(Joueur j)
	{
		ListJoueur.remove(j);
	}
	
	//retorune la premiere occurance du Joueur dans la liste
	public Joueur Find(String nom)
	{
		for(Joueur j : ListJoueur)
		{
			if(nom.equals(j.getPrenom() + " " + j.getNom()))
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
	
	public String afficherJoueur(Joueur j)
	{
		return j.afficherJoueur();
	}
}
