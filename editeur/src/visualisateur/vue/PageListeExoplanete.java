package visualisateur.vue;

import java.awt.ItemSelectable;
import java.io.IOException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import visualisateur.modele.Exoplanete;

public class PageListeExoplanete extends Page {

	public PageListeExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("listeExoplanete.fxml")));
		
	}
	
	public void afficherListeExoplanetes(List<Exoplanete> listeExoplanetes)
	{
		ObservableList<String> items = FXCollections.observableArrayList ();
		ListView grilleDesPlanetes = (ListView) this.lookup("#listeExoplanetes");
		for(Exoplanete exoplanete : listeExoplanetes)
		{
			items.add(exoplanete.getNom());
			//espaceTexte.appendText(exoplanete.getNom() + "\n");					
		}
		grilleDesPlanetes.setItems(items);
	}

	public String lireExoplaneteSelectionnee()
	{
		ListView grilleDesPlanetes = (ListView) this.lookup("#listeExoplanetes");
		return grilleDesPlanetes.getSelectionModel().getSelectedItem().toString();		
	}
	

	
}
