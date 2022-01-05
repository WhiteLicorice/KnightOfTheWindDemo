package org.raj.kotw.weapon;



/**
 * @author Rene Andre B. Jocsing
 * 
 * Weapon for wizards. Used as a vehicle for Wizard's fireball special attack. 
 *
 */
public class WeaponWizardWand implements Weapon {

	protected static final int DAMAGE = 30;
	protected static final int COST = 30;
	protected static final String TYPE = "WizardWand";
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
