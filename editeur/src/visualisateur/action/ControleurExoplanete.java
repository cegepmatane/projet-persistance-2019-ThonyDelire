package visualisateur.action;


import javafx.event.ActionEvent;
import visualisateur.donnee.ExoplaneteDOA;
import visualisateur.vue.NavigateurDesVues;

public class ControleurExoplanete 
{
	protected NavigateurDesVues navigateur;
	protected ExoplaneteDOA exoplaneteDOA;

	
	public ControleurExoplanete()
	{
		this.exoplaneteDOA = new ExoplaneteDOA();
		this.navigateur = NavigateurDesVues.getInstance();
		
		//this.navigateur.navigerVersPageExoplanete();
		//this.navigateur.navigerVerslistePageExoplanete();
	}
	public void initialiser()
	{
		this.navigateur.getPageListeExoplanete().afficherListeExoplanete(exoplaneteDOA.listerExoplanete());
	}
	
	public void recevoirActionNaviguerPageListeExoplanete(ActionEvent evenment)
	{
		this.navigateur.navigerVersListePageExoplanete();
	}
	
	public void recevoirActionNaviguerPageAjouterExoplanete(ActionEvent evenment)
	{
		this.navigateur.navigerVersPageAjouterExoplanete();
	}
	public void recevoirActionNaviguerPageEditerExoplanete(ActionEvent evenment)
	{
		this.navigateur.navigerVersPageEditerExoplanete();
	}
}
