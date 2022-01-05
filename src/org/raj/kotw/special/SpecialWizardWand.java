package org.raj.kotw.special;

import org.raj.kotw.actor.Actor;
import org.raj.kotw.weapon.Weapon;



/**
 * @author Rene Andre B. Jocsing
 * 
 * Contains logic for the Wizard Wand's special attack. Used in SpecialAttack. Used to implement strategy design pattern. 
 * 
 */
public class SpecialWizardWand implements Special {

	@Override
	public void doSpecial(Weapon weapon, Actor attacker, Actor defender) {
		// TODO Auto-generated method stub
		defender.setHealth(defender.getHealth() - weapon.getDamage());
		attacker.addSP(-(weapon.getCost()));
		System.out.println("\n");
		System.out.println("The wizard hurls a fireball, dealing explosive damage."); 
	}
	
}
