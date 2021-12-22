package org.raj.kotw;



/**
 * @author Rene Andre B. Jocsing
 * 
 * The WeaponSword class contains data for the sword weapon, implementing the Weapon interface for decorator compatibility.
 *
 */

public class WeaponSword implements Weapon {
	
	protected static final int DAMAGE = 20;
	protected static final int COST = 15;
	protected static final String TYPE = "Sword";
	
	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return DAMAGE;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return COST;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	public void dispStats() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("NAME: Sword");
		System.out.println("A nondescript sword. SPECIAL: Deals " + DAMAGE + " "
				+ "points of flat, unmitigated damage. COST: " + COST + "SP.");
	}

}
