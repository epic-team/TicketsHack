package fr.afcepf.al27.ticketshack.entity.entity;

// Generated 3 juin 2016 13:40:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Reduction generated by hbm2java
 */
@Entity
@Table(name = "reduction", catalog = "ticketshackds")
public class Reduction implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idReduction;
	private String libelleReduction;
	private long pourcentage;
	private long seuil;
	private Set<Utilisateur> utilisateurs = new HashSet<Utilisateur>(0);

	public Reduction() {
	}

	public Reduction(int idReduction, long pourcentage, long seuil) {
		this.idReduction = idReduction;
		this.pourcentage = pourcentage;
		this.seuil = seuil;
	}

	public Reduction(int idReduction, String libelleReduction,
			long pourcentage, long seuil, Set<Utilisateur> utilisateurs) {
		this.idReduction = idReduction;
		this.libelleReduction = libelleReduction;
		this.pourcentage = pourcentage;
		this.seuil = seuil;
		this.utilisateurs = utilisateurs;
	}

	@Id
	@Column(name = "ID_REDUCTION", unique = true, nullable = false)
	public int getIdReduction() {
		return this.idReduction;
	}

	public void setIdReduction(int idReduction) {
		this.idReduction = idReduction;
	}

	@Column(name = "LIBELLE_REDUCTION", length = 50)
	public String getLibelleReduction() {
		return this.libelleReduction;
	}

	public void setLibelleReduction(String libelleReduction) {
		this.libelleReduction = libelleReduction;
	}

	@Column(name = "POURCENTAGE", nullable = false, precision = 10, scale = 0)
	public long getPourcentage() {
		return this.pourcentage;
	}

	public void setPourcentage(long pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Column(name = "SEUIL", nullable = false, precision = 10, scale = 0)
	public long getSeuil() {
		return this.seuil;
	}

	public void setSeuil(long seuil) {
		this.seuil = seuil;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reduction")
	public Set<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
