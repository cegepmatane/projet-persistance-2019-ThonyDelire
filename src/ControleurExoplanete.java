
public class ControleurExoplanete 
{
	
	
	protected NavigateurDesVues navigateur;
	public ControleurExoplanete()
	{
		ExoplaneteDOA exoplaneteDOA = new ExoplaneteDOA();
		this.navigateur = NavigateurDesVues.getInstance();
		this.navigateur.getPageListeExoplanete().afficherListeExoplanete(exoplaneteDOA.listerExoplanete());
	}
}
