package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
@Entity
public class Heater extends SmartDevice {
	
	private Home home;
	private String power;

/**
 * 
 * @return une maison
 */
	@ManyToOne
	public Home getHome() {
		return home;
	}

	/**
	 * 
	 * @param home
	 */
	public void setHome(Home home) {
		this.home = home;
	}

	/**
	 * 
	 * @return la puissance d'un équipement
	 */
	public String getPower() {
		return power;
	}

	/**
	 * 
	 * @param power
	 */
	public void setPower(String power) {
		this.power = power;
	}
	
	
}
