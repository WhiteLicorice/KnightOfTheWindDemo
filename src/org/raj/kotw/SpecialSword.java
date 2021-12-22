package org.raj.kotw;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Rene Andre B. Jocsing
 *
 * The SwordSpecial class contains logic for the Sword's special attack, implementing SpecialMove interface, for use in SpecialAttack.
 * 
 * @see MoveSpecial
 * 
 * 
 */

public class SpecialSword implements SpecialMove {

	@Override
	public void doSpecial(Weapon weapon, Actor attacker, Actor defender) {
		// TODO Auto-generated method stub
		
		if (attacker.getSP() < weapon.getCost()) {
			System.out.println("You try to use your sword... But alas, you're too tired and in need of rest.");
			attacker.addSP(ThreadLocalRandom.current().nextInt(1, 4)); //Regenerate random SP ; 1 to 3. 
		}
		else {
			defender.setHealth(defender.getHealth() - weapon.getDamage());
			attacker.addSP(-(weapon.getCost()));
			System.out.println("You slash at" + defender.getName() + "with your sword, dealing critical damage. SWORDDDDD!!!");
		}
		
	}
	
	
}
