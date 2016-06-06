package fr.afcepf.al27.ticketshack.front.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al27.ticketshack.apiservice.apifacade.IFacade;
import fr.afcepf.al27.ticketshack.entity.entity.Categorie;
import fr.afcepf.al27.ticketshack.entity.entity.Civilite;
import fr.afcepf.al27.ticketshack.entity.entity.Utilisateur;
import fr.afcepf.al27.ticketshack.entity.entity.Theme;;

@Component("mbInscription")
public class MBInscription {
	
	@Autowired
	private IFacade facade;
	
	private List<Civilite> civilites = new ArrayList<>();
	private List<Theme> themes = new ArrayList<>();
	private List<Categorie> categories = new ArrayList<>();
	
	private Utilisateur utilisateur = new Utilisateur();
	
	

	@PostConstruct
	public void init(){
	   civilites = facade.getIServiceCompte().listerCivilites();
	   //categories = facade.
	   
	}

	public IFacade getFacade() {
		return facade;
	}
	
	
	public List<Theme> themesParCategorie(Categorie categorie){
		return facade.getIServiceCompte().listerThemesParCategorie(categorie);
	}
	
	
	
	
	

	public void setFacade(IFacade facade) {
		this.facade = facade;
	}

	public List<Civilite> getCivilites() {
		return civilites;
	}

	public void setCivilites(List<Civilite> civilites) {
		this.civilites = civilites;
	}

	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	
	
	

}
