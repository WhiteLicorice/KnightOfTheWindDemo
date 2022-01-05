package org.raj.kotw.core;


/**
 * @author Rene Andre B. Jocsing
 * Generic interface used for all dialogue-printing classes. 
 */
public interface Printer {
	//Prompter method for outputting text to user.
	void prompt(String output); 
	 //Pause method for inserting delays between outputs. 
	void pause();
	
}