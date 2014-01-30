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
	
	public void ajouter(int k)
	{
		if(nbCartes + 1 > 21){
			Carte c = Interaction.IOcarte(k);
			listCartes.add(c);
			
			nbCartes++;
		}
	}
	public void ajouter(String titre, String equipe, int annee){
		Carte c = new Carte(titre, equipe, annee);
		listCartes.add(c);
		
		nbCartes++;
	}
	
	public void modifier(int nb)
	{
		
	}
	
	public void deleteCarte(String nom)
	{
		afficherTout();
		if(Interaction.confirmationDelete()){
			listCartes.clear();
			Interaction.deleteConfirme(nom);
		}
	}
	
	public String afficherTout() {
		String s = "Le joueur a "+ nbCartes +" cartes enregistre\n";
		for(Carte c : listCartes)
		{
			s += "Carte " + (listCartes.indexOf(c)+1)   + " : \n";
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
