package fr.afcepf.al27.ticketshack.entity.entity;

// Generated 3 juin 2016 13:40:24 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Evenement generated by hbm2java
 */
@Entity
@Table(name = "evenement", catalog = "ticketshackds")
public class Evenement implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idEvenement;
	private Categorie categorie;
	private String libelleEvenement;
	private String descriptif;
	private Date parution;
	private String affiche;
	private String video;
	private String personnage1;
	private String personnage2;
	private String personnage3;
	private Set<Occurence> occurences = new HashSet<Occurence>(0);
	private Set<Theme> themes = new HashSet<Theme>(0);

	public Evenement() {
	}

	public Evenement(int idEvenement, Categorie categorie,
			String libelleEvenement, Date parution) {
		this.idEvenement = idEvenement;
		this.categorie = categorie;
		this.libelleEvenement = libelleEvenement;
		this.parution = parution;
	}

	public Evenement(int idEvenement, Categorie categorie,
			String libelleEvenement, String descriptif, Date parution,
			String affiche, String video, String personnage1,
			String personnage2, String personnage3, Set<Occurence> occurences,
			Set<Theme> themes) {
		this.idEvenement = idEvenement;
		this.categorie = categorie;
		this.libelleEvenement = libelleEvenement;
		this.descriptif = descriptif;
		this.parution = parution;
		this.affiche = affiche;
		this.video = video;
		this.personnage1 = personnage1;
		this.personnage2 = personnage2;
		this.personnage3 = personnage3;
		this.occurences = occurences;
		this.themes = themes;
	}

	@Id
	@Column(name = "ID_EVENEMENT", unique = true, nullable = false)
	public int getIdEvenement() {
		return this.idEvenement;
	}

	public void setIdEvenement(int idEvenement) {
		this.idEvenement = idEvenement;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CATEGORIE", nullable = false)
	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Column(name = "LIBELLE_EVENEMENT", nullable = false, length = 100)
	public String getLibelleEvenement() {
		return this.libelleEvenement;
	}

	public void setLibelleEvenement(String libelleEvenement) {
		this.libelleEvenement = libelleEvenement;
	}

	@Column(name = "DESCRIPTIF", length = 65535)
	public String getDescriptif() {
		return this.descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PARUTION", nullable = false, length = 10)
	public Date getParution() {
		return this.parution;
	}

	public void setParution(Date parution) {
		this.parution = parution;
	}

	@Column(name = "AFFICHE", length = 100)
	public String getAffiche() {
		return this.affiche;
	}

	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}

	@Column(name = "VIDEO", length = 100)
	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	@Column(name = "PERSONNAGE1", length = 100)
	public String getPersonnage1() {
		return this.personnage1;
	}

	public void setPersonnage1(String personnage1) {
		this.personnage1 = personnage1;
	}

	@Column(name = "PERSONNAGE2", length = 100)
	public String getPersonnage2() {
		return this.personnage2;
	}

	public void setPersonnage2(String personnage2) {
		this.personnage2 = personnage2;
	}

	@Column(name = "PERSONNAGE3", length = 100)
	public String getPersonnage3() {
		return this.personnage3;
	}

	public void setPersonnage3(String personnage3) {
		this.personnage3 = personnage3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "evenement")
	public Set<Occurence> getOccurences() {
		return this.occurences;
	}

	public void setOccurences(Set<Occurence> occurences) {
		this.occurences = occurences;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "qualifier", catalog = "ticketshackds", joinColumns = { @JoinColumn(name = "ID_EVENEMENT", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ID_THEME", nullable = false, updatable = false) })
	public Set<Theme> getThemes() {
		return this.themes;
	}

	public void setThemes(Set<Theme> themes) {
		this.themes = themes;
	}

}
