package visualisateur.action;


import javafx.event.ActionEvent;
import visualisateur.donnee.ExoplaneteDAO;
import visualisateur.modele.Exoplanete;
import visualisateur.vue.NavigateurDesPages;

public class ControleurExoplanete 
{
	protected NavigateurDesPages navigateur;
	protected ExoplaneteDAO exoplaneteDOA;

	
	public ControleurExoplanete()
	{
		this.exoplaneteDOA = new ExoplaneteDAO();
		this.navigateur = NavigateurDesPages.getInstance();
		
		//this.navigateur.navigerVersPageExoplanete();
		//this.navigateur.navigerVerslistePageExoplanete();
	}
	public void initialiser()
	{
		this.navigateur.getPageListeExoplanete().afficherListeExoplanetes(exoplaneteDOA.listerExoplanete());
	}
	
	public void recevoirActionNaviguerPageListeExoplanete(ActionEvent evenment)
	{
		this.navigateur.naviguerVersPageListeExoplanete();
	}
	
	public void recevoirActionNaviguerPageExoplanete(ActionEvent evenment)
	{
		String nom = this.navigateur.getPageListeExoplanete().lireExoplaneteSelectionnee(); 
		Exoplanete exoplanete = this.exoplaneteDOA.lireExoplaneteSelonNom(nom);
		this.navigateur.getPageExoplanete().afficherExoplanete(exoplanete);
		
		this.navigateur.naviguerVersPageExoplanete();
		
	}
	
}
