package fr.afcepf.al27.ticketshack.apidao.apidao;

import java.util.List;

import fr.afcepf.al27.ticketshack.entity.entity.Utilisateur;

public interface IDaoUtilisateur {

	public void insert(Utilisateur utilisateur);
	public void update(Utilisateur utilisateur);
	public Utilisateur findById(int idUtilisateur);
	public List<Utilisateur> findAll();
	public void delete(Utilisateur utilisateur);
	
}
