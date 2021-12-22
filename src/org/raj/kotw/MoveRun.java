package org.raj.kotw;


/**
 * @author Rene Andre B. Jocsing
 *
 * Strategy for running. If player isn't faster than the monster, this strategy fails. Otherwise, a portion of HP is restored.
 * No actual running happens because knights never run. 
 */
public class MoveRun implements MoveStrategy {

	@Override
	public void action(Actor player, Actor monster) {
		
		if (player.getSpeed() <= monster.getSpeed()) {
			System.out.println("You try to run away but " + monster.getName() + " is too fast for you!!!");
		}
		else {
			System.out.println("A knight never runs!!! Instead, you drink a potion, recovering some of your strength!!!");
			player.setHealth(player.getHealth() + Math.floorDiv(player.getHealth(), 10)); 
			//Restores one-tenth of your HP. A knight never runs!!!
		}
		
	}

}
