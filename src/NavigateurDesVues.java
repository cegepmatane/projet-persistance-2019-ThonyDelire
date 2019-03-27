import java.io.IOException;

import javax.management.InstanceAlreadyExistsException;

import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application {

	protected PageListeExoplanete pageListeExoplanete;
	protected Stage stade;
	
	public NavigateurDesVues() 
	{
		
			try {
				this.pageListeExoplanete = new PageListeExoplanete();
			} catch (IOException e) {
				e.printStackTrace();
			}

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
		ExoplaneteDOA exoplaneteDOA = new ExoplaneteDOA();
		this.pageListeExoplanete.afficherListeExoplanete(exoplaneteDOA.listerExoplanete());
		this.stade.show();
		
	}
	
	

}
