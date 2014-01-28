import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;


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
			case 1 : ajouterJoueur(); break;
			case 2 : afficherJoueur(); break;
			case 3 : System.out.println("Mise a jour"); break;
			case 4 : System.out.println("Effacer joueur"); break;
			case 5 : System.out.println("Liste joueurs"); break;
			case 6 : sauvegarderFichier(); break;
			case 0 : sauvegarderFichier(); System.exit(0); break;
			default: System.out.println("Rentrer un chiffre entre 0 et 6 svp") ; break;
		}
		afficherMenu();
	}
	
	
	private static void ajouterJoueur(){
		System.out.println("Option selectionne: 1. Ajouter un joueur");
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrez la cl� d'identification du joueur: ");
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jm.ajouterJoueur(s);
	}
	
	private static void afficherJoueur() {
		 System.out.println("Option selectionne: 2. Afficher l'information d'un joueur");
			System.out.println();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Entrez la cl� d'identification du joueur: ");
			String s="";
			try {
				s = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(jm.afficherJoueur(s));
	}
	
	private static void lireFichier(){
		try {
			File file = new File(System.getProperty("user.dir") + "\\src\\test1.txt");
			if(file.exists()){
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while ((line = br.readLine()) != null) {
					String[] contenus = line.split(";");
					for (int i = 0; i < contenus.length; i++) {
						if (contenus[i].contains("\"")) {
							contenus[i] = contenus[i].replace("\"", "");
						}
					}
					jm.ajouterJoueur(contenus);
				}
				br.close();
			}
				
		} catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}

	private static void sauvegarderFichier() throws IOException{
		int nb = 1;
		Writer writer = null;
	    try {
	    	while(new File(System.getProperty("user.dir") + "\\src\\test" + nb + ".txt").exists())
	    		nb++;
			writer = new BufferedWriter(new OutputStreamWriter(
			        new FileOutputStream(System.getProperty("user.dir") + "\\src\\test" + nb + ".txt"), "utf-8"));
			String fileContent = jm.afficherInfoFichierTexte();
			writer.write(fileContent);
			System.out.println("Option s�lectionn�: 6. Sauvegarder\nLe fichier" + System.getProperty("user.dir") + "\\src\\test" + nb + ".txt a ete cree avec succes.");
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		}
	    writer.close();
	}
	
	
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		lireFichier();
		afficherMenu();
		
	}

}
