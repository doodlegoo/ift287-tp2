import java.util.ArrayList;
import java.util.List;


public class JeuDeCarte {

	private List<Carte> listCartes;
	private int nbCartes;
	public JeuDeCarte()
	{
		nbCartes=0;
		listCartes = new ArrayList<Carte>();
	}
	
	public void ajouter(int i)
	{
		// Demande les infos de la carte
		Carte c = Interaction.IOcarte();
		listCartes.add(c);
		
		nbCartes++;
	}
	public void ajouter(String titre, String equipe, int annee){
		Carte c = new Carte(titre, equipe, annee);
		listCartes.add(c);
		
		nbCartes++;
	}
	
	public void modifier(int nb)
	{
		
	}
	
	public void deleteCarte(int nb)
	{
		afficherTout();
		System.out.println("Voulez vous effacer l'information de ce joueur ? (O/N)");
		
		if("blabla"=="blabla"){
			listCartes.clear();
			System.out.println("L'information du joueur Alex Rodriguez a ete efface du systeme.");
		}
		
	}
	
	public String afficherTout() {
		String s = "Le joueur a "+ nbCartes +" cartes enregistre\n";
		for(Carte c : listCartes)
		{
			s += c.afficher();
		}
		return s;
	}
	
	public String afficherFichierTexte(){
		String s = "";
		for(Carte c : listCartes){
			s += c.afficherFichierTexte();
		}
		return s;
	}
	
}
