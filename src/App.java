import java.util.List;

public class App {

	public static void main(String[] args) {
		
		/*ExoplaneteDOA exoplaneteDOA = new ExoplaneteDOA();
		List<Exoplanete> liste = exoplaneteDOA.listerExoplanete();
		
		for(Exoplanete exoplanete : liste){
			System.out.println(exoplanete.getNom());
		}*/
		
		NavigateurDesVues.launch(NavigateurDesVues.class, args);
		ControleurExoplanete controleur = new ControleurExoplanete();
		

	}

}
