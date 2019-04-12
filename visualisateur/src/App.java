import java.util.List;

import visualisateur.vue.NavigateurDesPages;

public class App {

	public static void main(String[] args) {
		
		/*ExoplaneteDOA exoplaneteDOA = new ExoplaneteDOA();
		List<Exoplanete> liste = exoplaneteDOA.listerExoplanete();
		
		for(Exoplanete exoplanete : liste){
			System.out.println(exoplanete.getNom());
		}*/
		
		NavigateurDesPages.launch(NavigateurDesPages.class, args);
		
		

	}

}
