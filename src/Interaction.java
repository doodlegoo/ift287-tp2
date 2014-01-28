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
import java.util.ArrayList;
import java.util.List;

public class Interaction {
	
	public static void IOmenu(int option)
	{
		System.out.print("Option selectionne: " + option + ". ");
		switch (option) {
		case 1:
			System.out.print("Ajouter un joueur\n");
			break;
		case 2:
			System.out.print("Afficher l'information d'un joueur\n");
			break;
		case 3:
			System.out.print("Mise a jour de l'information d'un joueur\n");
			break;
		case 5:
			System.out.print("Liste de joueurs\n");
			break;
		case 6:
			System.out.print("Sauvegarder\n");
			break;
		case 0:
			System.out.print("Sortir\n");
			break;
		}
	}
	
	public static Carte IOcarte()
	{
		String titre = "";
		int annee = 0;
		String equipe = "";
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Entrez le titre de la carte : ");
		try {
			titre = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("Entrez l'equipe de la carte : ");
		try {
			equipe = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.print("Entrez l'annee de parution de la carte : ");
		try {
			annee = Integer.parseInt(br.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new Carte(titre, equipe, annee);
		
		
	}
	
	public static void IOSauvegarder(String fileContent) throws IOException{
		int nb = 1;
		Writer writer = null;
	    try {
	    	while(new File(System.getProperty("user.dir") + "\\src\\test" + nb + ".txt").exists())
	    		nb++;
			writer = new BufferedWriter(new OutputStreamWriter(
			        new FileOutputStream(System.getProperty("user.dir") + "\\src\\test" + nb + ".txt"), "utf-8"));
			writer.write(fileContent);
			System.out.println("Option s�lectionn�: 6. Sauvegarder\nLe fichier" + System.getProperty("user.dir") + "\\src\\test" + nb + ".txt a ete cree avec succes.");
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		}
	    writer.close();
	}
	public static String IOAjoutJoueur(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrez la cle d'identification du joueur: ");
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static String IOAfficherJoueur(){
		System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrez la cle d'identification du joueur: ");
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static List<String[]> IOInitialisation(){
		List<String[]> listeJoueurs = new ArrayList<String[]>();
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
					listeJoueurs.add(contenus);
				}
				br.close();
			}
				
		} catch (IOException e){
			e.printStackTrace();			
		}
		return listeJoueurs;
	}
	
	public static void IOjoueur()
	{
		
	}
}
