package org.raj.kotw;


/**
 * @author Rene Andre B. Jocsing
 * IGeneric interface used for all dialogue-printing classes. 
 */
public interface DialoguePrinter {
	void prompt(String output); //Prompter method for outputting text to user.
	void pause(); //Pause method for inserting delays between outputs. 
	
}
