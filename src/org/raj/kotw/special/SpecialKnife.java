package org.raj.kotw.special;

import java.util.concurrent.ThreadLocalRandom;

import org.raj.kotw.actor.Actor;
import org.raj.kotw.weapon.Weapon;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Contains logic for the Knife's special attack. Used in SpecialAttack. Used to implement strategy design pattern.
 * 
 * 
 *
 */
public class SpecialKnife implements Special {
	
	@Override
	public void doSpecial(Weapon weapon, Actor attacker, Actor defender) {
		// TODO Auto-generated method stub
		
		if (attacker.getSP() < weapon.getCost()) {
			System.out.println("\n");
			System.out.println("You try to use your knife... But alas, you're too tired and in need of rest.");
			attacker.addSP(ThreadLocalRandom.current().nextInt(1, 6)); //Regenerate random SP ; 1 to 5. 
		}
		else {
			defender.setHealth(defender.getHealth() - weapon.getDamage());
			attacker.addSP(-(weapon.getCost()));
			System.out.println("\n");
			System.out.println("You lash out with your knife, dealing a lot of damage. SHINK!!!");
		}
		
	}

}
