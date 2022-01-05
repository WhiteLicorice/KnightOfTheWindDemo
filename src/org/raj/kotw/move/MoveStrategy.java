package org.raj.kotw.move;

import org.raj.kotw.actor.Actor;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Abstract interface for some move strategy. Used to implement strategy design pattern. 
 * 
 *
 *
 */
public interface MoveStrategy {
	//Interface for implementing strategy: combat moves.
	public void action(Actor one, Actor two); //action: do something in combat
}
	
