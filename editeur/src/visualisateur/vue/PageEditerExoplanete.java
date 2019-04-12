package visualisateur.vue;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import visualisateur.modele.Exoplanete;


public class PageEditerExoplanete extends Page {

	public PageEditerExoplanete() throws IOException {
		super(FXMLLoader.load(PageListeExoplanete.class.getResource("editer-exoplanete.fxml")));
		
	}
	
	public void afficherExoplanete(Exoplanete exoplanete)
	{
		TextArea espaceNom = (TextArea)this.lookup("#champNom");
		
		String exoplaneteNom ="";
		
		exoplaneteNom += exoplanete.getNom();
		
		espaceNom.setText(exoplaneteNom);
		//----------------------------------------------------
		TextArea espaceEtoile = (TextArea)this.lookup("#champEtoile");
		
		String exoplaneteEtoile ="";
		
		exoplaneteEtoile += exoplanete.getEtoile();
		
		espaceEtoile.setText(exoplaneteEtoile);
		//----------------------------------------------------
		TextArea espaceMasse = (TextArea)this.lookup("#champMasse");
				
		String exoplaneteMasse="";
				
		exoplaneteMasse += exoplanete.getMasse();
				
		espaceMasse.setText(exoplaneteMasse);
		//----------------------------------------------------
		TextArea espaceRayon = (TextArea)this.lookup("#champRayon");
						
		String exoplaneteRayon="";
						
		exoplaneteRayon += exoplanete.getRayon();
						
		espaceRayon.setText(exoplaneteRayon);
		//----------------------------------------------------
		TextArea espaceFlux = (TextArea)this.lookup("#champFlux");
								
		String exoplaneteFlux="";
								
		exoplaneteFlux += exoplanete.getFlux();
								
		espaceFlux.setText(exoplaneteFlux);
		//----------------------------------------------------
		TextArea espaceTemperature = (TextArea)this.lookup("#champTemperature");
										
		String exoplaneteTemperature="";
										
		exoplaneteTemperature += exoplanete.getTemperature();
										
		espaceTemperature.setText(exoplaneteTemperature);
		//----------------------------------------------------
		TextArea espacePeriode = (TextArea)this.lookup("#champPeriode");
										
		String exoplanetePeriode="";
										
		exoplanetePeriode += exoplanete.getPeriode();
										
		espacePeriode.setText(exoplanetePeriode);
		//----------------------------------------------------
		TextArea espaceDistance = (TextArea)this.lookup("#champDistance");
												
		String exoplaneteDistance="";
												
		exoplaneteDistance += exoplanete.getDistance();
												
		espaceDistance.setText(exoplaneteDistance);
	}
	
	public Exoplanete lireExoplanete()
	{
		Exoplanete exoplanete = new Exoplanete();
		
		TextField champsNom = (TextField) this.lookup("#champNom");
		String nom = champsNom.getText();
		champsNom.setText("");
		TextField champsEtoile = (TextField) this.lookup("#champEtoile");
		String etoile = champsEtoile.getText();
		champsEtoile.setText("");
		TextField champsMasse = (TextField) this.lookup("#champMasse");
		String masse = champsMasse.getText();
		champsMasse.setText("");
		TextField champsRayon = (TextField) this.lookup("#champRayon");
		String rayon = champsRayon.getText();
		champsRayon.setText("");
		TextField champsFlux = (TextField) this.lookup("#champFlux");
		String flux = champsFlux.getText();
		champsFlux.setText("");
		TextField champsTemperature = (TextField) this.lookup("#champTemperature");
		String temperature = champsTemperature.getText();
		champsTemperature.setText("");
		TextField champsPeriode = (TextField) this.lookup("#champPeriode");
		String periode = champsPeriode.getText();
		champsPeriode.setText("");
		TextField champsDistance = (TextField) this.lookup("#champDistance");
		String distance = champsDistance.getText();
		champsDistance.setText("");
		
		//exoplanete.setNom(nom);
		
		
		
		return exoplanete;
	}

}
