package domain;

import jpa.EntityManagerHelper;

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
	public ElectronicDevice readByConsoMoy(float consoMoyenne) {
		return EntityManagerHelper.getEntityManager().find(ElectronicDevice.class, consoMoyenne);		//return p.getId();

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
