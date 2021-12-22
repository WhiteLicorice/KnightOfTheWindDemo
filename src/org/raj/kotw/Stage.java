package org.raj.kotw;

/**
 * @author Rene Andre B. Jocsing
 * The abstraction of a Stage object used to denote chapters in the game.
 * Each stage must have a name represented by a string, an id represented by an int, and a method play that 
 * contains the events of the stage. 
 * See Stage 1 for a concrete example: 
 * @see StageOne.
 * 
 **/


abstract class Stage {
	public String name; 	//Name of each stage. Acts as chapters. 
	public int id;  		//ID of each stage for indexing.
	
	/**
	 * @author Rene Andre B Jocsing
	 *The play() method can be called to play the 'script' of the stage. It is in charge of initializing whatever variables
	 *are needed to successfully run it, as well as manipulating variables according to what happens in the stage. It doesn't return
	 *anything. 
	 */
	
	abstract void play();   //Generic method used to call the events scripted into each stage. 
}
