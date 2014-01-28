import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class Inventaire{
	
	private static JoueurManager jm = new JoueurManager();
	
	public static void afficherMenu() throws IOException{
		System.out.println("Application de gestion de cartes de baseball");
		System.out.println("Voici la liste d'operations valides : ");
		System.out.println("1. Ajouter un joueur ");
		System.out.println("2. Afficher l'information d'un joueur"); 
		System.out.println("3. Mise a jour de l'information d'un joueur"); 
		System.out.println("4. Effacer l'information d'un joueur ");
		System.out.println("5. Liste des joueurs ");
		System.out.println("6. Sauvegarde ");
		System.out.println("0. Sortir ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Votre selection : ");
	
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i = Integer.parseInt(s);
		switch(i){ 
			case 1 : Interaction.IOmenu(i); ajouterJoueur(); break;
			case 2 : Interaction.IOmenu(i); afficherJoueur(); break;
			case 3 : Interaction.IOmenu(i); break;
			case 4 : Interaction.IOmenu(i); effaceJoueur(); break;
			case 5 : Interaction.IOmenu(i); break;
			case 6 : Interaction.IOmenu(i); sauvegarderFichier(); break;
			case 0 : Interaction.IOmenu(i); sauvegarderFichier(); System.exit(0); break;
			default: System.out.println("Rentrer un chiffre entre 0 et 6 svp") ; break;
		}
		afficherMenu();
	}
	
	
	private static void ajouterJoueur(){
		jm.ajouterJoueur(Interaction.IOAjoutJoueur());
	}
	
	private static void afficherJoueur() {
		System.out.println(jm.afficherJoueur(Interaction.IOAfficherJoueur()));
	}
	
	private static void effaceJoueur(){
		String id = Interaction.IOAfficherJoueur();
		System.out.println(jm.afficherJoueur(id));
		String resultat = Interaction.IOEffacerJoueur();
		if(resultat.toUpperCase() == "O")
			jm.retirerJoueur(jm.find(id));
		
	}
	
	private static void lireFichier(){
		List<String[]> listeJoueurs = Interaction.IOInitialisation();
		for (String[] contenu : listeJoueurs) {
			jm.ajouterJoueur(contenu);
		}
	}

	private static void sauvegarderFichier() throws IOException{
		Interaction.IOSauvegarder(jm.afficherInfoFichierTexte());
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		lireFichier();
		afficherMenu();
		
	}

}
