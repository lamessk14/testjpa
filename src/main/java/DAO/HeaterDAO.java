package DAO;



import java.util.Collection;
import java.util.List;

import domain.Heater;
import jpa.EntityManagerHelper;

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
public class HeaterDAO implements GenericDao<Heater, Long> {

	public Heater create(Heater heater) {

		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().persist(heater);

		EntityManagerHelper.commit();

		return heater;

	}

	public Heater read(Long id) {
		return EntityManagerHelper.getEntityManager().find(Heater.class, id); // return
																				// p.getId();

	}

	public Heater update(Heater heater) {
		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().merge(heater);

		EntityManagerHelper.commit();

		return heater;
	}

	
	public void delete(Heater heater) {
		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().remove(heater);

		EntityManagerHelper.commit();

	}

}
