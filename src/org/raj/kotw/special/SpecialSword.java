package org.raj.kotw.special;

import java.util.concurrent.ThreadLocalRandom;

import org.raj.kotw.actor.Actor;

import org.raj.kotw.weapon.Weapon;

/**
 * @author Rene Andre B. Jocsing
 *
 * Contains logic for the Sword's special attack. Used in SpecialAttack. Used to implement strategy design pattern.
 * 
 *
 * 
 * 
 */

public class SpecialSword implements Special {

	@Override
	public void doSpecial (Weapon weapon, Actor attacker, Actor defender) {
		// TODO Auto-generated method stub
		
		if (attacker.getSP() < weapon.getCost()) {
			System.out.println("\n");
			System.out.println("You try to use your sword... But alas, you're too tired and in need of rest.");
			attacker.addSP(ThreadLocalRandom.current().nextInt(1, 4)); //Regenerate random SP ; 1 to 3. 
		}
		else {
			defender.setHealth(defender.getHealth() - weapon.getDamage());
			attacker.addSP(-(weapon.getCost()));
			System.out.println("\n");
			System.out.println("You slash at the " + defender.getName() + " with your sword, dealing critical damage. SWORDDDDD!!!");
		}
		
	}
	
	
}
