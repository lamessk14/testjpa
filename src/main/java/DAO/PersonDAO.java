package DAO;


import java.util.Collection;
import java.util.List;

import domain.Home;
import domain.Person;
import jpa.EntityManagerHelper;

public class PersonDAO implements GenericDao<Person,Long>{
	
	public Person create(Person person) {

		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().persist(person);

		EntityManagerHelper.commit();
		
		return person;
	}



	public Person read(Long id) {
		return EntityManagerHelper.getEntityManager().find(Person.class, id);		//return p.getId();

	}

	public List<Person> readByName(String name) {
		return EntityManagerHelper.getEntityManager().createQuery("select p from Person as p where p.name=:name").setParameter("name",name).getResultList();		//return p.getId();

	}
	
	public List<Person> readAll() {
		return EntityManagerHelper.getEntityManager().createQuery("select p from Person as p").getResultList();		//return p.getId();

	}
	
	
	public List<Person> readByHomes( Collection<Home> homes) {
		return EntityManagerHelper.getEntityManager().createQuery("select p from Person as p where p.home=:home").setParameter("home",homes).getResultList();		//return p.getId();

	}

	public Person update(Person person) {
		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().merge(person);

		EntityManagerHelper.commit();

		return person;
	}

	public void delete(Person person) {
		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().remove(person);

		EntityManagerHelper.commit();

	}

}
