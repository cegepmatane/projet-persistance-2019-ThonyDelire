import java.util.List;

import visualisateur.action.AlgorithmeRecherche;
import visualisateur.action.AlgorithmeRechercheProfesseurTournesol;
import visualisateur.donnee.ExoplaneteDAO;
import visualisateur.vue.NavigateurDesPages;

public class App {

	public static void main(String[] args) {
		
		
		
		NavigateurDesPages.launch(NavigateurDesPages.class, args);
		
		AlgorithmeRecherche algorithmeRecherche = new AlgorithmeRechercheProfesseurTournesol(ExoplaneteDAO.getInstance().listerExoplanete)
		

	}

}
