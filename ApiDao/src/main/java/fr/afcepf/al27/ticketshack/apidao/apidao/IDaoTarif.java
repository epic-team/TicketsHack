package fr.afcepf.al27.ticketshack.apidao.apidao;

import java.util.List;

import fr.afcepf.al27.ticketshack.entity.entity.Tarif;

public interface IDaoTarif {
	
	public void insert(Tarif tarif);
	public void update(Tarif tarif);
	public Tarif findById(int idTarif);
	public List<Tarif> findAll();
	public void delete(Tarif tarif);
	
}
