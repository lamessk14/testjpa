package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DAO.PersonDAO;
import domain.Person;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonDAO daop = new PersonDAO();
		daop.create(new Person("fanta","diallo","fantadiallo@gmail.com"));
		
		Person p = daop.read((long) 2);
		
		
		System.out.println("Récupéré : " + p.getEmail());
	}

}
