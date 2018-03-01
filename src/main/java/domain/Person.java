package domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
public class Person {
	
	//Declaration des variables
	private Long Id;
	private String name;
	private String firtsName;
	private String email;
	private Collection<Home> homes;
	private Collection <ElectronicDevice> electronicDevices;
	private Collection<Person> persons; 
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

/**
 * 
 * @param name
 * @param firtsName
 * @param email
 */
	public Person(String name, String firtsName, String email) {
		super();
		this.name = name;
		this.firtsName = firtsName;
		this.email = email;
	}
	
	
	//Getters et setters
	@Id
	@GeneratedValue
	public Long getId() {
		return Id;
	}
/**
 * 
 * @param id
 */
	public void setId(Long id) {
		Id = id;
	}
	
	/**
	 * 
	 * @return le nom d'une personne
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return le prenom d'une personne
	 */
	public String getFirtsName() {
		return firtsName;
	}
	
	/**
	 * 
	 * @param firtsName
	 */
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	/**
	 * 
	 * @return l'email d'une personne
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @return la liste de maisons
	 */
	@OneToMany(mappedBy="person", cascade = CascadeType.PERSIST)
	public Collection<Home> getHomes() {
		return homes;
	}

	/**
	 * 
	 * @param homes
	 */
	public void setHomes(Collection<Home> homes) {
		this.homes = homes;
	}

	/**
	 * 
	 * @return la liste d'equipements
	 */
	@OneToMany(mappedBy="person", cascade = CascadeType.PERSIST)
	public Collection<ElectronicDevice> getElectronicDevices() {
		return electronicDevices;
	}

	/**
	 * 
	 * @param electronicDevices
	 */
	public void setElectronicDevices(Collection<ElectronicDevice> electronicDevices) {
		this.electronicDevices = electronicDevices;
	}
	
	/**
	 * 
	 * @return la liste de personnes
	 */
	@OneToMany(mappedBy="persons")
	public Collection<Person> getPersons() {
		return persons;
	}

	/**
	 * 
	 * @param persons
	 */
	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}	

}
