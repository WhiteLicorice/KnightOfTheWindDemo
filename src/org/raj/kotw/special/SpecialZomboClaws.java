package org.raj.kotw.special;

import org.raj.kotw.actor.Actor;


import org.raj.kotw.weapon.Weapon;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Contains logic for Zombie Claws special attack. Used in SpecialAttack. Used to implement strategy design pattern. *
 */

public class SpecialZomboClaws implements Special {

	@Override
	public void doSpecial(Weapon weapon, Actor attacker, Actor defender) {
		// TODO Auto-generated method stub
		defender.setHealth(defender.getHealth() - weapon.getDamage());
		attacker.addSP(-(weapon.getCost()));
		attacker.setHealth(attacker.getHealth() + 10);
		System.out.println("\n");
		System.out.println("The zombie claws at you, dealing critical damage. Its wounds close before your eyes."); 
		
	}

}
