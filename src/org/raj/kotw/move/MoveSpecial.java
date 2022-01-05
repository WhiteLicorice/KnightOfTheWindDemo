package org.raj.kotw.move;

import org.raj.kotw.actor.Actor;
import org.raj.kotw.special.Special;
import org.raj.kotw.special.SpecialKnife;
import org.raj.kotw.special.SpecialRustedSword;
import org.raj.kotw.special.SpecialSword;
import org.raj.kotw.special.SpecialWizardWand;
import org.raj.kotw.special.SpecialZomboClaws;
import org.raj.kotw.weapon.Weapon;

//Special attacks for PLAYER and MONSTER based on weapon.


/**
 * @author Rene Andre B. Jocsing
 * 
 * This class handles the special attack strategy. 
 * 
 * @see MoveStrategy
 *
 */

public class MoveSpecial implements MoveStrategy {
	
	
	
	//#TODO: Decouple special attacks into their own classes for nested strategy design pattern. DONE.
	
	
	
	/**
	 * @author Rene Andre B. Jocsing
	 * 
	 * Private helper method for calling individual strategies. Implements strategy design pattern. 
	 * 
	 * @param special 
	 * 		The weapon strategy you want to use
	 * @param weapon
	 * 		The weapon the attacker is using
	 * @param attacker
	 * 		The one using the special move
	 * @param defender
	 * 		The target of the special move (except in cases of attacker having self-targeting special move)	 
	 * */
	
	private void useSpecial(Special special, Weapon weapon, Actor attacker, Actor defender) { //Use strategy here. 
		special.doSpecial(weapon, attacker, defender);
	}
	
	/**
	 * @author Rene Andre B. Jocsing
	 * 
	 * 
	 * SpecialAttack's action method decides what happens when the player uses a special attack. Calls the helper method useSpecial.
	 * Implements strategy design pattern. Throws RunTime Exception upon bad usage. 
	 * 
	 */
	
	@Override
	public void action (Actor attacker, Actor defender) throws RuntimeException {
		
		Weapon aWep = attacker.getWep();
		
		switch (aWep.getType()) { //Fetch ID then use the appropriate strategy based on it. 
			case ("Knife"):
				SpecialKnife spKnife = new SpecialKnife();
				this.useSpecial(spKnife, aWep, attacker, defender);
				break;
			case ("Sword"):
				SpecialSword spSword = new SpecialSword();
				this.useSpecial(spSword, aWep, attacker, defender);
				break;
			case ("ZomboClaws"):
				SpecialZomboClaws spZomboClaws = new SpecialZomboClaws();
				this.useSpecial(spZomboClaws, aWep, attacker, defender);
				break;
			case ("RustedSword"):
				SpecialRustedSword spRustedSword = new SpecialRustedSword();
				this.useSpecial(spRustedSword, aWep, attacker, defender);
				break;
			case ("WizardWand"):
				SpecialWizardWand spWizardWand = new SpecialWizardWand();
				this.useSpecial(spWizardWand, aWep, attacker, defender);
				break;
			default: //Throw runtime exception on bad call. 
				throw new RuntimeException("Need to use strategy properly. Please consult JavaDoc or see #Combat in #Core package.");
		
		}
		
		
	}
}
