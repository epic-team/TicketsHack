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
import javax.persistence.Table;

/**
 * Theme generated by hbm2java
 */
@Entity
@Table(name = "theme", catalog = "ticketshackds")
public class Theme implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idTheme;
	private String libelleTheme;
	private Set<Categorie> categories = new HashSet<Categorie>(0);
	private Set<Utilisateur> utilisateurs = new HashSet<Utilisateur>(0);
	private Set<Evenement> evenements = new HashSet<Evenement>(0);

	public Theme() {
	}

	public Theme(int idTheme, String libelleTheme) {
		this.idTheme = idTheme;
		this.libelleTheme = libelleTheme;
	}

	public Theme(int idTheme, String libelleTheme, Set<Categorie> categories,
			Set<Utilisateur> utilisateurs, Set<Evenement> evenements) {
		this.idTheme = idTheme;
		this.libelleTheme = libelleTheme;
		this.categories = categories;
		this.utilisateurs = utilisateurs;
		this.evenements = evenements;
	}

	@Id
	@Column(name = "ID_THEME", unique = true, nullable = false)
	public int getIdTheme() {
		return this.idTheme;
	}

	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}

	@Column(name = "LIBELLE_THEME", nullable = false, length = 50)
	public String getLibelleTheme() {
		return this.libelleTheme;
	}

	public void setLibelleTheme(String libelleTheme) {
		this.libelleTheme = libelleTheme;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "themes")
	public Set<Categorie> getCategories() {
		return this.categories;
	}

	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "preferer", catalog = "ticketshackds", joinColumns = { @JoinColumn(name = "ID_THEME", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ID_UTILISATEUR", nullable = false, updatable = false) })
	public Set<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "themes")
	public Set<Evenement> getEvenements() {
		return this.evenements;
	}

	public void setEvenements(Set<Evenement> evenements) {
		this.evenements = evenements;
	}

}
