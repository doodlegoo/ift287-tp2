import java.util.SortedSet;
import java.util.TreeSet;


public class JeuDeCarte {

	private SortedSet<Carte> listCartes;
	private int nbCartes;
	public JeuDeCarte()
	{
		nbCartes=0;
		listCartes = new TreeSet<Carte>();
	}
	
	public void Ajouter(Carte c)
	{
		listCartes.add(c);
		++nbCartes;
	}
	
	public void Modifier(int nb)
	{
		
	}
	public String afficherTout() {
		String s = "Le joueur a "+ nbCartes +" cartes enregistre";
		for(Carte c : listCartes)
		{
			s += c.afficher();
		}
		return s;
	}
	
}
