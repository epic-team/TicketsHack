package fr.afcepf.al27.ticketshack.apiservice.apifacade;

import fr.afcepf.al27.ticketshack.apiservice.apiservice.IServiceCompte;
import fr.afcepf.al27.ticketshack.apiservice.apiservice.IServiceEvenement;

public interface IFacade {

	IServiceEvenement getServiceEvenement(); 
	
	IServiceCompte getIServiceCompte();
}
