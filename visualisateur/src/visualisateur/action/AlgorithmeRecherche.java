package visualisateur.action;

import java.util.List;

import visualisateur.modele.Exoplanete;

public class AlgorithmeRecherche {
	
	protected List<Exoplanete> listePlanetes = null;
	protected List<Exoplanete> listePlanetesFiltrees = null;
	
	public AlgorithmeRecherche(List<Exoplanete> listePlanetes) 
	{
		this.listePlanetes = listePlanetes;
	}
	
	public void executer()
	{
		this.listePlanetesFiltrees = this.trouverLesPlaneteHabitables(this.listePlanetesFiltrees);
		this.listePlanetesFiltrees = this.trouverLesPlaneteAtteignables(this.listePlanetesFiltrees);
		this.listePlanetesFiltrees = this.trouverLesPlaneteAnalysables(this.listePlanetesFiltrees);
	}
	
	public List<Exoplanete> trouverLesPlaneteHabitables(List<Exoplanete> listeExoplanetes)
	{
		return listeExoplanetes;
	}
	public List<Exoplanete> trouverLesPlaneteAtteignables(List<Exoplanete> listeExoplanetes)
	{
		return listeExoplanetes;
	}
	public List<Exoplanete> trouverLesPlaneteAnalysables(List<Exoplanete> listeExoplanetes)
	{
		return listeExoplanetes;
	}
	

}
