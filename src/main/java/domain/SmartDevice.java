package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

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
	
	public void setIdSD(long idSD) {
		this.idSD = idSD;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	

}
