package org.raj.kotw.weapon;



/**
 * @author Rene Andre B. Jocsing
 * 
 * The base sword weapon. Used as a vehicle for Player's sword special attack. 
 *
 */

public class WeaponSword implements Weapon {
	
	protected static final int DAMAGE = 20;
	protected static final int COST = 20;
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
