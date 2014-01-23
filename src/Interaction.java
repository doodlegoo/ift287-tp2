import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Interaction {
	
	public static void IOmenu()
	{
		
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
	
	public static void IOjoueur()
	{
		
	}
}
