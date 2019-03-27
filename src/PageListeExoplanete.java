
import java.io.IOException;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

public class PageListeExoplanete extends Page {

	public PageListeExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("listeExoplanete.fxml")));
		
	}
	
	public void afficherListeExoplanete(List<Exoplanete> listeExoplanetes)
	{
		TextArea espaceTexte = (TextArea) this.lookup("#listeExoplanetes");
		for(Exoplanete exoplanete : listeExoplanetes) 
		{
			espaceTexte.appendText(exoplanete.getNom() + "\n");
		}
		
	}

	
}
