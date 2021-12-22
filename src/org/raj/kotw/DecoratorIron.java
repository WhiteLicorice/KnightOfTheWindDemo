package org.raj.kotw;



/**
 * @author Rene Andre B. Jocsing
 * 
 * Class that contains iron weapon upgrade for decorator design pattern. 
 *
 */
public class DecoratorIron extends WeaponDecorator {
	
	private static final int DAMAGE_MODIFIER = 5;
	
	public DecoratorIron(Weapon decoratedWeapon) {
		super(decoratedWeapon);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getDamage() {
		return decoratedWeapon.getDamage() + DecoratorIron.DAMAGE_MODIFIER;
	}
	
	@Override
	public void dispStats() {
		decoratedWeapon.dispStats();
		System.out.println("IRON UPGRADE: this weapon has been reinforced with iron alloy. Special damage increased by " 
		+ DecoratorIron.DAMAGE_MODIFIER + ".");
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return decoratedWeapon.getCost();
	}

}
