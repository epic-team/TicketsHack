package fr.afcepf.al27.ticketshack.impldao.impldao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al27.ticketshack.apidao.apidao.IDaoCategorie;
import fr.afcepf.al27.ticketshack.entity.entity.Categorie;
import fr.afcepf.al27.ticketshack.entity.entity.Theme;

@Repository
@Transactional
public class ImplDaoCategorie implements IDaoCategorie {
	
	EntityManager em;

	@PersistenceContext(unitName="entityManagerFactory")
	public void setEm(EntityManager em) {
		this.em = em;
	}


	@Override
	public void insert(Categorie categorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Categorie categorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public Categorie findById(int idCategorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Categorie categorie) {
		// TODO Auto-generated method stub

	}
	
	
}
