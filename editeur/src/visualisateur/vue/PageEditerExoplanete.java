package visualisateur.vue;
import java.io.IOException;

import javafx.fxml.FXMLLoader;


public class PageEditerExoplanete extends Page {

	public PageEditerExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("editer-exoplanete.fxml")));
		
	}
	

}
