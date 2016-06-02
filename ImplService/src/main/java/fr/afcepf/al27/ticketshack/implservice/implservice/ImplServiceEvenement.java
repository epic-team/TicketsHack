package fr.afcepf.al27.ticketshack.implservice.implservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afcepf.al27.ticketshack.apidao.apidao.IDaoEvenement;
import fr.afcepf.al27.ticketshack.apiservice.apiservice.IServiceEvenement;
import fr.afcepf.al27.ticketshack.entity.entity.Evenement;

@Service
public class ImplServiceEvenement implements IServiceEvenement{

	@Autowired
	private IDaoEvenement daoEvenement;
	
	@Override
	public Evenement getEvenementById(int idEvenement) {
		return daoEvenement.getEvenementById(idEvenement);
	}

}
