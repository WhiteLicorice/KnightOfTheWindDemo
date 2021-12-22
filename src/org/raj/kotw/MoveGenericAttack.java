package org.raj.kotw;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Class for handling generic attack strategy. @see Combat
 */
public class MoveGenericAttack implements MoveStrategy {
	public void action (Actor attacker, Actor defender){
		int damage = (attacker.getAttack() - defender.getDefense());
		
		//formula for calculating damage done: attacker's attack minus defender's defense.
		
		if (damage > 0) { //Guard conditional versus negative damage. 
			defender.setHealth(defender.getHealth() - damage); //Set new health using setter method. 
			System.out.println(attacker.getName() + " dealt " + damage + " to " + defender.getName() + "!!!"); 
		} else {
			System.out.println("No damage!!!"); //If no damage, just prompt. 
		}
		
		
		 
	}
}
