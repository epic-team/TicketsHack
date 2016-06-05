package fr.afcepf.al27.ticketshack.impldao.impldao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al27.ticketshack.apidao.apidao.IDaoTheme;
import fr.afcepf.al27.ticketshack.entity.entity.Categorie;
import fr.afcepf.al27.ticketshack.entity.entity.Theme;


@Repository
@Transactional
public class ImplDaoTheme implements IDaoTheme {
	
	EntityManager em;

	@PersistenceContext(unitName="entityManagerFactory")
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void insert(Theme theme) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Theme theme) {
		// TODO Auto-generated method stub

	}

	@Override
	public Theme findById(int idTheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Theme> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Theme theme) {
		// TODO Auto-generated method stub

	}
	
	public List<Theme> findThemeByCategory(Categorie categorie){
		String requete = "SELECT t FROM Theme t WHERE :cat IN t.categories";
		TypedQuery<Theme> query = em.createQuery(requete, Theme.class);
		query.setParameter("cat", categorie);
		return query.getResultList();	
	}

}
