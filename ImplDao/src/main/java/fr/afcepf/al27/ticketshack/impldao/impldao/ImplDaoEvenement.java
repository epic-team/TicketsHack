package fr.afcepf.al27.ticketshack.impldao.impldao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al27.ticketshack.apidao.apidao.IDaoEvenement;
import fr.afcepf.al27.ticketshack.entity.entity.Evenement;

@Repository
@Transactional
public class ImplDaoEvenement implements IDaoEvenement{

	EntityManager em;
	
	@PersistenceContext(unitName="entityManagerFactory")
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Evenement getEvenementById(int idEvenement) {
		return em.find(Evenement.class, idEvenement);
	}
	
}
