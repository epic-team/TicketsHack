package fr.afcepf.al27.ticketshack.apiservice.apiservice;

import fr.afcepf.al27.ticketshack.entity.entity.Evenement;


public interface IServiceEvenement {

	Evenement getEvenementById(int idEvenement);
}
