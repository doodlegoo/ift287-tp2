import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//alex test
public class start{
	
	public static void afficherMenu(){
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch(s){ 
			case "1" : System.out.println("Ajouter joueur"); break;
			case "2" : System.out.println("Afficher info joueur"); break;
			case "3" : System.out.println("Mise a jour"); break;
			case "4" : System.out.println("Effacer joueur"); break;
			case "5" : System.out.println("Liste joueurs"); break;
			case "6" : System.out.println("Save"); break;
			case "0":System.exit(0); break;
			default: System.out.println("Rentrer un chiffre entre 0 et 6 svp") ; break;
		}		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afficherMenu();
		
		
	}

}
