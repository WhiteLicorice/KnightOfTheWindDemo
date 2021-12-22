package org.raj.kotw;

public class SpecialZomboClaws implements SpecialMove {

	@Override
	public void doSpecial(Weapon weapon, Actor attacker, Actor defender) {
		// TODO Auto-generated method stub
		defender.setHealth(defender.getHealth() - weapon.getDamage());
		attacker.addSP(-(weapon.getCost()));
		System.out.println("The zombie claws at you, dealing critical damage."); 
		
	}

}
