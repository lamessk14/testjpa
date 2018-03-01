package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
@Entity
public class ElectronicDevice extends SmartDevice{
	

	private float consoMoyenne;
	private Person person;
	
	/**
	 * 
	 * @return la consommation moyenne
	 */
	public float getConsoMoyenne() {
		return consoMoyenne;
	}
	
	/**
	 * 
	 * @param consoMoyenne
	 */
	public void setConsoMoyenne(float consoMoyenne) {
		this.consoMoyenne = consoMoyenne;
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

}
