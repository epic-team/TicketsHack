package fr.afcepf.al27.ticketshack.apidao.apidao;

import java.util.List;

import fr.afcepf.al27.ticketshack.entity.entity.Departement;

public interface IDaoDepartement {
	
	public void insert(Departement departement);
	public void update(Departement departement);
	public Departement findById(int idDepartement);
	public List<Departement> findAll();
	public void delete(Departement departement);
	
}
