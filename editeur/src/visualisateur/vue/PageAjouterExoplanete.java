package visualisateur.vue;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import visualisateur.modele.Exoplanete;


public class PageAjouterExoplanete extends Page {

	public PageAjouterExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("ajouter-exoplanete.fxml")));
		
	}
	
	public Exoplanete lireExoplanete()
	{
		Exoplanete exoplanete = new Exoplanete();
		
		TextField champsNom = (TextField) this.lookup("#champNom");
		String nom = champsNom.getText();
		System.out.println("Nouveau nom" + nom);
		//exoplanete.setNom(nom);
		
		
		
		return exoplanete;
	}
	

}
