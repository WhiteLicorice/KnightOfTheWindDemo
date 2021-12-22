package org.raj.kotw;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Class that contains silver weapon upgrade for decorator design pattern. 
 *
 */ 

public class DecoratorSilver extends WeaponDecorator {
	
	private static final int DAMAGE_MODIFIER = 20;
	
	public DecoratorSilver(Weapon decoratedWeapon) {
		super(decoratedWeapon);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getDamage() {
		return decoratedWeapon.getDamage() + DecoratorSilver.DAMAGE_MODIFIER;
	}
	
	@Override
	public void dispStats() {
		decoratedWeapon.dispStats();
		System.out.println("SILVER UPGRADE: this weapon has been reinforced with silver alloy. "
				+ "Special damage increased by " + DecoratorSilver.DAMAGE_MODIFIER + ".");
	}
	
	public int getCost() {
		// TODO Auto-generated method stub
		return decoratedWeapon.getCost();
	}

}
