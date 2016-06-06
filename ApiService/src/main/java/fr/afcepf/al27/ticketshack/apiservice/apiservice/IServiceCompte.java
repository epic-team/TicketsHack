package fr.afcepf.al27.ticketshack.apiservice.apiservice;

import java.util.List;

import fr.afcepf.al27.ticketshack.entity.entity.Categorie;
import fr.afcepf.al27.ticketshack.entity.entity.Civilite;
import fr.afcepf.al27.ticketshack.entity.entity.Theme;
import fr.afcepf.al27.ticketshack.entity.entity.Utilisateur;

public interface IServiceCompte {
	
	Utilisateur inscrireUtilisateur (Utilisateur utilisateur);
	List<Civilite> listerCivilites();
	List<Theme> listerThemesParCategorie(Categorie categorie);
	Utilisateur trouverUtilisateurParMail (String mail);
	Utilisateur authentifierUtilisateur (String mail, String mdp);
	
	
		
}
