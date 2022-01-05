package org.raj.kotw.move;

import org.raj.kotw.actor.Actor;

/**
 * @author Rene Andre B. Jocsing
 *
 * Strategy for running. If player isn't faster than the monster, this strategy fails. Otherwise, a portion of HP is restored.
 * No actual running happens because knights never run. Used as a fail-safe against losing in the demo. WIll be rebalanced in the actual release.
 * 
 * 
 */
public class MoveRun implements MoveStrategy {

	@Override
	public void action(Actor player, Actor monster) {
		
		if (player.getSpeed() <= monster.getSpeed()) {
			System.out.println("\n");
			System.out.println("You try to run away but " + monster.getName() + " is too fast for you!!!");
		}
		else {
			System.out.println("\n");
			System.out.println("A knight never runs!!! Instead, you drink an elixir, recovering all of your health!!!");
			player.setHealth(player.getMaxHP());
			//Instead of running, 'run' restores all your HP. A knight never runs!!! 
		}
		
	}

}
