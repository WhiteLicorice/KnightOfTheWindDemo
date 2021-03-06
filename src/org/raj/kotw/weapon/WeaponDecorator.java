package org.raj.kotw.weapon;



/**
 * @author Rene Andre B. Jocsing
 *
 * Abstraction for all weapon decorators.  Used to implement decorator design pattern. 
 */

public abstract class WeaponDecorator implements Weapon {
	protected Weapon decoratedWeapon;
	
	public WeaponDecorator (Weapon decoratedWeapon) {
		this.decoratedWeapon = decoratedWeapon;
	}
	
	public int getDamage() {
		return decoratedWeapon.getDamage();
	}
	
	public void dispStats() {
		decoratedWeapon.dispStats();
	}
	
	public int getCost() {
		return decoratedWeapon.getCost();
	}
	
	public String getType() {
		return decoratedWeapon.getType();
		
	}
}
