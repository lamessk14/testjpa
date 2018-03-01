package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
@Entity
@Inheritance
public abstract class SmartDevice  implements Serializable{
	
	private long idSD;
	private String type;
	
	@Id
	@GeneratedValue
	public long getIdSD() {
		return idSD;
	}
	
	/**
	 * 
	 * @param idSD
	 */
	public void setIdSD(long idSD) {
		this.idSD = idSD;
	}
	
	/**
	 * 
	 * @return le type d'equipement
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

}
