package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import domain.Person;
import domain.PersonDAO;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonDAO daop = new PersonDAO();
		daop.create(new Person());
	}

}
