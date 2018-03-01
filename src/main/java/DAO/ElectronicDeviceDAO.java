package DAO;

import java.util.List;

import domain.ElectronicDevice;
import domain.Person;
import jpa.EntityManagerHelper;

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
public class ElectronicDeviceDAO implements GenericDao<ElectronicDevice,Long>{
	
	public ElectronicDevice create(ElectronicDevice electronicDevice) {

		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().persist(electronicDevice);

		EntityManagerHelper.commit();

		return electronicDevice;

	}


	public ElectronicDevice read(Long id) {
		return EntityManagerHelper.getEntityManager().find(ElectronicDevice.class, id);		//return p.getId();

	}
	
	/**
	 * 
	 * @param consoMoyenne
	 * @return
	 */
	public ElectronicDevice readByConsoMoy(float consoMoyenne) {
		return EntityManagerHelper.getEntityManager().find(ElectronicDevice.class, consoMoyenne);		//return p.getId();
	}
	
	/**
	 * 
	 * @return
	 */
	public List<ElectronicDevice> readAll() {
		return EntityManagerHelper.getEntityManager().createQuery("select d from SmartDevice as d").getResultList();		//return p.getId();

	}


	public ElectronicDevice update(ElectronicDevice electronicDevice) {
		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().merge(electronicDevice);

		EntityManagerHelper.commit();

		return electronicDevice;
	}

	public void delete(ElectronicDevice electronicDevice) {
		EntityManagerHelper.beginTransaction();

		EntityManagerHelper.getEntityManager().remove(electronicDevice);

		EntityManagerHelper.commit();
	}

}
