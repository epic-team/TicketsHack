package fr.afcepf.al27.ticketshack.implservice.implservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afcepf.al27.ticketshack.apidao.apidao.IDaoCivilite;
import fr.afcepf.al27.ticketshack.apidao.apidao.IDaoTheme;
import fr.afcepf.al27.ticketshack.apiservice.apiservice.IServiceCompte;
import fr.afcepf.al27.ticketshack.entity.entity.Categorie;
import fr.afcepf.al27.ticketshack.entity.entity.Civilite;
import fr.afcepf.al27.ticketshack.entity.entity.Theme;
import fr.afcepf.al27.ticketshack.entity.entity.Utilisateur;

@Service
public class ImplServiceCompte implements IServiceCompte{
	
	
	@Autowired
	private IDaoTheme daoTheme;
	
	@Autowired
	private IDaoCivilite daoCivilite;

	@Override
	public Utilisateur inscrireUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Civilite> listerCivilites() {
		return daoCivilite.findAll();
	}

	@Override
	public List<Theme> listerThemesParCategorie(Categorie categorie) {
		return daoTheme.findThemeByCategory(categorie);
	}

	@Override
	public Utilisateur trouverUtilisateurParMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur authentifierUtilisateur(String mail, String mdp) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	
	
	

}
