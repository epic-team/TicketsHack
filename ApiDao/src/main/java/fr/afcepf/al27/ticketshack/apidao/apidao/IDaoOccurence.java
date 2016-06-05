package fr.afcepf.al27.ticketshack.apidao.apidao;

import java.util.List;

import fr.afcepf.al27.ticketshack.entity.entity.Occurence;

public interface IDaoOccurence {
	
	public void insert(Occurence occurence);
	public void update(Occurence occurence);
	public Occurence findById(int idOccurence);
	public List<Occurence> findAll();
	public void delete(Occurence occurence);
	
}
