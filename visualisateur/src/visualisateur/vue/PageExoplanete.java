package visualisateur.vue;
import java.io.IOException;

import javafx.fxml.FXMLLoader;


public class PageExoplanete extends Page {

	public PageExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("Exoplanete.fxml")));
		
	}
	

}
