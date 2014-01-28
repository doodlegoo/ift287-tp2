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
	
	public String afficherFichierTexte(){
		String s = "";
		for(Carte c : listCartes){
			s += c.afficherFichierTexte();
		}
		return s;
	}
	
}
