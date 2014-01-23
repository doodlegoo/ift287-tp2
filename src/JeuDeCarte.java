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
	
	public void ajouter(int i)
	{
		// Demande les infos de la carte
		Carte c = new Carte(i);
		listCartes.add(c);
		
		nbCartes++;
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
