package visualisateur.action;


import javafx.event.ActionEvent;
import visualisateur.donnee.ExoplaneteDAO;
import visualisateur.modele.Exoplanete;
import visualisateur.vue.NavigateurDesVues;

public class ControleurExoplanete 
{
	protected NavigateurDesVues navigateur;
	protected ExoplaneteDAO exoplaneteDOA;

	
	public ControleurExoplanete()
	{
		this.exoplaneteDOA = new ExoplaneteDAO();
		this.navigateur = NavigateurDesVues.getInstance();
		
		//this.navigateur.navigerVersPageExoplanete();
		//this.navigateur.navigerVerslistePageExoplanete();
	}
	public void initialiser()
	{
		this.navigateur.getPageListeExoplanete().afficherListeExoplanetes(exoplaneteDOA.listerExoplanete());
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
		String nom = this.navigateur.getPageListeExoplanete().lireExoplaneteSelectionnee();
		Exoplanete exoplanete = this.exoplaneteDOA.lireExoplaneteSelonNom(nom);
		this.navigateur.getPageEditerExoplanete().afficherExoplanete(exoplanete);
		
		this.navigateur.navigerVersPageEditerExoplanete();
	}
	
	public void recevoirActionEnregistreAjout(ActionEvent evenment)
	{
		Exoplanete exoplanete = this.navigateur.getPageAjouterExoplanete().lireExoplanete();
		
		this.navigateur.navigerVersListePageExoplanete();
	}
		
	
}
