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

public class Person {
	
	//Déclaration des vrariables
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

	public void setId(Long id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFirtsName() {
		return firtsName;
	}
	
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@OneToMany(mappedBy="person", cascade = CascadeType.PERSIST)
	public Collection<Home> getHomes() {
		return homes;
	}

	public void setHomes(Collection<Home> homes) {
		this.homes = homes;
	}

	@OneToMany(mappedBy="person", cascade = CascadeType.PERSIST)
	public Collection<ElectronicDevice> getElectronicDevices() {
		return electronicDevices;
	}

	public void setElectronicDevices(Collection<ElectronicDevice> electronicDevices) {
		this.electronicDevices = electronicDevices;
	}
	
	@OneToMany(mappedBy="persons")
	public Collection<Person> getPersons() {
		return persons;
	}

	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}
	
	
	

}
