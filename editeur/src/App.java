import java.util.List;

import visualisateur.vue.NavigateurDesVues;

public class App {

	public static void main(String[] args) {
		
		/*ExoplaneteDOA exoplaneteDOA = new ExoplaneteDOA();
		List<Exoplanete> liste = exoplaneteDOA.listerExoplanete();
		
		for(Exoplanete exoplanete : liste){
			System.out.println(exoplanete.getNom());
		}*/
		
		NavigateurDesVues.launch(NavigateurDesVues.class, args);
		
		

	}

}
