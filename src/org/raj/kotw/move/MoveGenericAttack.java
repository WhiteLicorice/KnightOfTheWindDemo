package org.raj.kotw.move;

import org.raj.kotw.actor.Actor;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Class that handles generic attack strategy. Uses the Actors' respective attack and defense stats to calculate damage and their getters and setters to adjust values. 
 * 
 * 
 */
public class MoveGenericAttack implements MoveStrategy {
	public void action (Actor attacker, Actor defender){
		int damage = (attacker.getAttack() - defender.getDefense());
		
		//formula for calculating damage done: attacker's attack minus defender's defense.
		
		if (damage > 0) { //Guard conditional versus negative damage. 
			defender.setHealth(defender.getHealth() - damage); //Set new health using setter method. 
			System.out.println("\n");
			System.out.println(attacker.getName() + " dealt " + damage + " damage to " + defender.getName() + "!!!"); 
		} else {
			System.out.println("\n");
			System.out.println("No damage!!!"); //If no damage, just prompt. 
		}
		
		
		 
	}
}
