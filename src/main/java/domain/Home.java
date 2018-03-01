package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
@Entity

public class Home {

	private Long id;
	private float taille;
	private int nbreDePieces;
	private Person person;
	//private Collection<Heater> heaters;
	public List<Heater> heaters = new ArrayList<Heater>();

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return la taille d'une maison
	 */
	public float getTaille() {
		return taille;
	}

	/**
	 * 
	 * @param taille
	 */
	public void setTaille(float taille) {
		this.taille = taille;
	}

	/**
	 * 
	 * @return le nombre de pièces
	 */
	public int getNbreDePieces() {
		return nbreDePieces;
	}

	/**
	 * 
	 * @param nbreDePieces
	 */
	public void setNbreDePieces(int nbreDePieces) {
		this.nbreDePieces = nbreDePieces;
	}

	/**
	 * 
	 * @return une personne
	 */
	@ManyToOne
	public Person getPerson() {
		return person;
	}

	/**
	 * 
	 * @param person
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * 
	 * @param heater
	 */
	public void addDevice(Heater heater) {
		this.heaters.add(heater);
	}
	
	/**
	 * @return the heaters
	 */
	@OneToMany
	@JoinColumn(name="home_id")
	public List<Heater> getHeaters() {
		return heaters;
	}

	/**
	 * 
	 * @param heaters
	 */
	public void setHeaters(List<Heater> heaters) {
		this.heaters = heaters;
	}

}
