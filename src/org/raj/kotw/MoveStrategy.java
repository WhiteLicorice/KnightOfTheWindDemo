package org.raj.kotw;


/**
 * @author Rene Andre B. Jocsing
 * 
 * Abstract interface for some move strategy. Used to implement strategy design pattern. @see Combat
 *
 */
public interface MoveStrategy {
	//Interface for implementing strategy: combat moves.
	public void action(Actor one, Actor two); //action: do something in combat
}
	
