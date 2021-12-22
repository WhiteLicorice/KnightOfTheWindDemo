package org.raj.kotw;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Rene Andre B. Jocsing
 * 
 * The KnifeSpecial class contains logic for the Knife's special attack, implementing SpecialMove interface, for use in SpecialAttack.
 * 
 * @see MoveSpecial
 *
 */
public class SpecialKnife implements SpecialMove {
	
	@Override
	public void doSpecial(Weapon weapon, Actor attacker, Actor defender) {
		// TODO Auto-generated method stub
		
		if (attacker.getSP() < weapon.getCost()) {
			System.out.println("You try to use your knife... But alas, you're too tired and in need of rest.");
			attacker.addSP(ThreadLocalRandom.current().nextInt(1, 6)); //Regenerate random SP ; 1 to 5. 
		}
		else {
			defender.setHealth(defender.getHealth() - weapon.getDamage());
			attacker.addSP(-(weapon.getCost()));
			System.out.println("You lash out with your knife, dealing a lot of damage. SHINK!!!");
		}
		
	}

}
