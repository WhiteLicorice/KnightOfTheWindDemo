package org.raj.kotw;

import java.util.concurrent.ThreadLocalRandom; //import for random shenanigans

//Special attacks for PLAYER based on weapon.


/**
 * @author Rene Andre B. Jocsing
 * 
 * This class handles the special attack strategy. See @see MoveStrategy
 *
 */
public class MoveSpecial implements MoveStrategy {
	
	/**
	 * SpecialAttack's action method decides what happens when the player uses a special attack.
	 */
	
	//#TODO: Decouple special attacks into their own classes for nested strategy design pattern. DONE.
	
	public void useSpecial(SpecialMove special, Weapon weapon, Actor attacker, Actor defender) { //Use strategy here. 
		special.doSpecial(weapon, attacker, defender);
	}
	
	@Override
	public void action (Actor attacker, Actor defender) {
		
		Weapon aWep = attacker.getWep();
		
		switch (aWep.getType()) {
			case("Knife"):
				SpecialKnife spKnife = new SpecialKnife();
				this.useSpecial(spKnife, aWep, attacker, defender);
				break;
			case("Sword"):
				SpecialSword spSword = new SpecialSword();
				this.useSpecial(spSword, aWep, attacker, defender);
				break;
			case("ZomboClaws"):
				//#TODO: Implement ZomboClaws special attack into its own class. DONE
				SpecialZomboClaws spZomboClaws = new SpecialZomboClaws();
				this.useSpecial(spZomboClaws, aWep, attacker, defender);
				break;
			default:
				throw new RuntimeException("Need to use strategy properly. Please consult JavaDoc or see #Combat");
		
		}
		
		
	}
}
