package org.raj.kotw.stage;

/**
 * @author Rene Andre B. Jocsing
 * Superclass of all Stage objects used to store levels in the game.
 * 
 **/


public class Stage {
	public String name; 	//Name of each stage. Acts as chapters. 
	public int id;  		//ID of each stage for indexing.
	
	/**
	 * @author Rene Andre B Jocsing
	 *
	 * Serves as a vehicle for the events of the stage. 
	 */
	
	public void play() {   //Generic method used to call the events scripted into each stage. 
	}
}
