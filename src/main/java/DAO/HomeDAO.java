package DAO;

import java.util.Collection;
import java.util.List;

import domain.Heater;
import domain.Home;
import jpa.EntityManagerHelper;

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
public class HomeDAO implements GenericDao<Home,Long>{
	
	public Home create(Home home) {

		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().persist(home);

		EntityManagerHelper.commit();

		return home;
	}

	public Home read(Long id) {
		return EntityManagerHelper.getEntityManager().find(Home.class, id);		//return p.getId();

	}

	public int readByTaille(float taille) {
		return EntityManagerHelper.getEntityManager().createQuery("select p from home as p where p.tail=:tail").setParameter("tail",taille).getFirstResult();

	}
	
	public List<Home> readByheaters(Collection <Heater> heaters) {
		return EntityManagerHelper.getEntityManager().createQuery("select p from home as p where p.heater=:heater").setParameter("heater",heaters).getResultList();

	}

	public Home update(Home home) {
		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().merge(home);

		EntityManagerHelper.commit();

		return home;
	}

	public void delete(Home home) {
		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().remove(home);

		EntityManagerHelper.commit();
	}
}
