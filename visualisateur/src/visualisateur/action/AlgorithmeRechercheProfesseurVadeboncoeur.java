package visualisateur.action;

import java.util.ArrayList;
import java.util.List;

import visualisateur.modele.Exoplanete;

public class AlgorithmeRechercheProfesseurVadeboncoeur extends AlgorithmeRecherche {
	
	
	public AlgorithmeRechercheProfesseurVadeboncoeur(List<Exoplanete> listePlanetes) {
		super(listePlanetes);
		
	}
	public List<Exoplanete> trouverLesPlaneteHabitables(List<Exoplanete> listeExoplanetes)
	{
		
		List<Exoplanete> listePanetesSelectionnees = new ArrayList<Exoplanete>();
		
		for(Exoplanete exoplanete : listeExoplanetes)
		{
			float flux = Float.parseFloat(exoplanete.getFlux());
			float temperature = Float.parseFloat(exoplanete.getTemperature());
			
			if(flux >= 1.6 && flux <= 2.4 && temperature > 240)
			{
				listePanetesSelectionnees.add(exoplanete);
			}
		}
		
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
