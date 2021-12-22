package org.raj.kotw;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Class that contains steel weapon upgrade for decorator design pattern. 
 *
 */

public class DecoratorSteel extends WeaponDecorator {
	
	private static final int DAMAGE_MODIFIER = 10;
	
	public DecoratorSteel(Weapon decoratedWeapon) {
		super(decoratedWeapon);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getDamage() {
		return decoratedWeapon.getDamage() + DecoratorSteel.DAMAGE_MODIFIER;
	}
	
	@Override
	public void dispStats() {
		decoratedWeapon.dispStats();
		System.out.println("STEEL UPGRADE: this weapon has been reinforced with steel alloy. Special damage increased by " 
		+ DecoratorSteel.DAMAGE_MODIFIER + ".");
	}
	
	public int getCost() {
		// TODO Auto-generated method stub
		return decoratedWeapon.getCost();
	}

}


