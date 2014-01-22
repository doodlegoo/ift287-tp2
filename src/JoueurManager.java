import java.util.SortedSet;
import java.util.TreeSet;

import com.sun.source.tree.CaseTree;

public class JoueurManager {
	private SortedSet<Joueur> ListJoueur;
	
	JoueurManager()
	{
		ListJoueur = new TreeSet<Joueur>();
	}
	
	//trouver le joueur a modifier
	public boolean Modifier(String NomJoueur)
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
}
