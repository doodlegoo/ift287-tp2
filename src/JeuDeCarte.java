import java.util.SortedSet;
import java.util.TreeSet;


public class JeuDeCarte {

	private SortedSet<Carte> ListCartes;
	
	public JeuDeCarte()
	{
		ListCartes = new TreeSet<Carte>();
	}
	
	public void Ajouter(Carte c)
	{
		ListCartes.add(c);
	}
	
	public void Retirer(Carte c)
	{
	
	}
	
	public void Modifier(Carte c, Carte r)
	{
		
	}
}
