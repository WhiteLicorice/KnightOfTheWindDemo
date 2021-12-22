package org.raj.kotw;


/**
 * @author Rene Andre B. Jocsing
 * 
 * WeaponZombieClaws is the weapon of zombies. The class contains, special damage, cost, and type, 
 *
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
		System.out.println("Dummy description. Players shouldn't have access to this.");
	}

}
