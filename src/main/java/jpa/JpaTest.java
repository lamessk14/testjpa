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
		daop.create(new Person("Louise-Agnès","MACKONGO","mackongo@gmail.com"));
		daop.create(new Person("Louise-Agnès1","MACKONGO1","mackongo1@gmail.com"));
		daop.create(new Person("Louise-Agnès2","MACKONGO2","mackongo2@gmail.com"));
		daop.create(new Person("Louise-Agnès3","MACKONGO3","mackongo3@gmail.com"));
		daop.create(new Person("Louise-Agnès4","MACKONGO4","mackongo4@gmail.com"));
		daop.create(new Person("Louise-Agnès5","MACKONGO5","mackongo5@gmail.com"));
		daop.create(new Person("Louise-Agnès6","MACKONGO6","mackongo6@gmail.com"));
		//daop.create(new Person());
		
		//Person p = daop.read((long) 2);
		
		
		//System.out.println("RÃ©cupÃ©rÃ© : " + p.getEmail());
	}

}
