package domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Home {

	private Long id;
	private float taille;
	private int nbreDePieces;
	private Person person;
	private Collection<Heater> heaters;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public int getNbreDePieces() {
		return nbreDePieces;
	}

	public void setNbreDePieces(int nbreDePieces) {
		this.nbreDePieces = nbreDePieces;
	}

	@ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@OneToMany(mappedBy = "home", cascade = CascadeType.PERSIST)
	public Collection<Heater> getHeaters() {
		return heaters;
	}

	public void addDevice(Heater heater) {
		this.heaters.add(heater);
	}

	public void setHeaters(Collection<Heater> heaters) {
		this.heaters = heaters;
	}

}
