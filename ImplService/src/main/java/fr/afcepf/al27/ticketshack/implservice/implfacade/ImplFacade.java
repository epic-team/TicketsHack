package fr.afcepf.al27.ticketshack.implservice.implfacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al27.ticketshack.apiservice.apifacade.IFacade;
import fr.afcepf.al27.ticketshack.apiservice.apiservice.IServiceEvenement;

@Component
public class ImplFacade implements IFacade {

	@Autowired
	private IServiceEvenement serviceEvenement;
	
	@Override
	public IServiceEvenement getServiceEvenement() {
		return serviceEvenement;
	}

}
