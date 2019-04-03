package visualisateur.vue;
import java.io.IOException;

import javax.management.InstanceAlreadyExistsException;

import javafx.application.Application;
import javafx.stage.Stage;
import visualisateur.action.ControleurExoplanete;

public class NavigateurDesVues extends Application {

	protected PageListeExoplanete pageListeExoplanete;
	protected PageExoplanete pageExoplanete;
	protected PageAjouterExoplanete pageAjouterExoplanete;
	protected Stage stade;
	protected ControleurExoplanete controleur;
	
	public NavigateurDesVues() 
	{
		NavigateurDesVues.instance = this;
		
		
			try {
				this.pageListeExoplanete = new PageListeExoplanete();
				this.pageExoplanete = new PageExoplanete();
			} catch (IOException e) {
				e.printStackTrace();
			}

			this.controleur = new ControleurExoplanete();
	}
	
	public PageListeExoplanete getPageListeExoplanete() {
		return pageListeExoplanete;
	}

	protected static NavigateurDesVues instance = null;
	public static NavigateurDesVues getInstance()
	{
		return instance;
	}
	
	@Override
	public void start(Stage stade) throws Exception {
		this.stade = stade;
		this.stade.setScene(this.pageListeExoplanete);
		//ExoplaneteDOA exoplaneteDOA = new ExoplaneteDOA();
		//this.pageListeExoplanete.afficherListeExoplanete(exoplaneteDOA.listerExoplanete());
		this.stade.show();
		
		this.controleur.initialiser();
		//this.navigerVersPageExoplanete();
		//this.navigerVersListePageExoplanete();
		
	}
	
	public void navigerVersPageExoplanete()
	{
		this.stade.setScene(this.pageExoplanete);
	}
	public void navigerVersListePageExoplanete()
	{
		this.stade.setScene(this.pageListeExoplanete);
	}
	
	

}
