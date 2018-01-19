package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ElectronicDevice extends SmartDevice{
	

	private float consoMoyenne;
	private Person person;
	
	
	public float getConsoMoyenne() {
		return consoMoyenne;
	}
	
	public void setConsoMoyenne(float consoMoyenne) {
		this.consoMoyenne = consoMoyenne;
	}

	@ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
