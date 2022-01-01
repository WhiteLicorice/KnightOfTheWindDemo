package org.raj.kotw.weapon;



/**
 * @author Rene Andre B. Jocsing
 *
 * The basic knife weapon. Used in-game as a vehicle for Player's knife special attack.
 * 
 */
public class WeaponKnife implements Weapon {

	protected static final int DAMAGE = 15;
	protected static final int COST = 10;
	protected static final String TYPE = "Knife";
	
	public String getType() {
		return TYPE;
	}
	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return DAMAGE;
	}

	@Override
	public void dispStats() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("NAME: Knife");
		System.out.println("A nondescript knife. SPECIAL: Deals " + DAMAGE + " "
				+ "points of flat, unmitigated damage. COST: " + COST + "SP.");
		
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return WeaponKnife.COST;
	}


}
