package fr.afcepf.al27.ticketshack.entity.entity;

// Generated 3 juin 2016 13:40:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categorie generated by hbm2java
 */
@Entity
@Table(name = "categorie", catalog = "ticketshackds")
public class Categorie implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idCategorie;
	private String libelleCategorie;
	private Set<Evenement> evenements = new HashSet<Evenement>(0);
	private Set<Theme> themes = new HashSet<Theme>(0);

	public Categorie() {
	}

	public Categorie(int idCategorie, String libelleCategorie) {
		this.idCategorie = idCategorie;
		this.libelleCategorie = libelleCategorie;
	}

	public Categorie(int idCategorie, String libelleCategorie,
			Set<Evenement> evenements, Set<Theme> themes) {
		this.idCategorie = idCategorie;
		this.libelleCategorie = libelleCategorie;
		this.evenements = evenements;
		this.themes = themes;
	}

	@Id
	@Column(name = "ID_CATEGORIE", unique = true, nullable = false)
	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	@Column(name = "LIBELLE_CATEGORIE", nullable = false, length = 50)
	public String getLibelleCategorie() {
		return this.libelleCategorie;
	}

	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorie")
	public Set<Evenement> getEvenements() {
		return this.evenements;
	}

	public void setEvenements(Set<Evenement> evenements) {
		this.evenements = evenements;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "associer", catalog = "ticketshackds", joinColumns = { @JoinColumn(name = "ID_CATEGORIE", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ID_THEME", nullable = false, updatable = false) })
	public Set<Theme> getThemes() {
		return this.themes;
	}

	public void setThemes(Set<Theme> themes) {
		this.themes = themes;
	}

}
