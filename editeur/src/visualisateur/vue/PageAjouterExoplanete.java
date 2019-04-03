package visualisateur.vue;
import java.io.IOException;

import javafx.fxml.FXMLLoader;


public class PageAjouterExoplanete extends Page {

	public PageAjouterExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("ajouter-exoplanete.fxml")));
		
	}
	

}
