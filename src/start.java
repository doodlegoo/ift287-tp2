import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class start{

	public static String s="";
	
	
	public static void afficherMenu(){
		System.out.println("Application de gestion de cartes de baseball");
		System.out.println("Voici la liste d'opérations valides : ");
		System.out.println("1. Ajouter un joueur ");
		System.out.println("2. Afficher l'information d'un joueur"); 
		System.out.println("3. Mise à jour de l'information d'un joueur"); 
		System.out.println("4. Effacer l'information d'un joueur ");
		System.out.println("5. Liste des joueurs ");
		System.out.println("6. Sauvegarde ");
		System.out.println("0. Sortir ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Votre sélection : ");
		
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(s);
		
	}
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afficherMenu();
		
		
	}

}
