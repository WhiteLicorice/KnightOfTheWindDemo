package org.raj.kotw.weapon;


/**
 * @author Rene Andre B. Jocsing
 * 
 * Weapon for zombies. Used in-game as a vehicle for Zombie's lifesteal special attack. *
 */

public class WeaponZombieClaws implements Weapon {
	
	protected static final int DAMAGE = 10;
	protected static final int COST = 10;
	protected static final String TYPE = "ZomboClaws";
	
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
		System.out.println("Dummy description. Players shouldn't have access to this. Hacker.");
	}

}
