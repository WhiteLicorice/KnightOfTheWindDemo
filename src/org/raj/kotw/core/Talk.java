package org.raj.kotw.core;



/**
 * @author Rene Andre B. Jocsing
 * 
 * Printer class for named dialogue. Used for outputting dialogue in script format with in-built between lines. Core module. 
 * 
 * 
 *
 */
public class Talk implements Printer {
	//Declare a String speaker. Used to hold the name of the actor speaking with the instance of the class.
	String speaker; 
	
	//Generic constructor. Assigns name to the speaker.
	public Talk(String character) {
		this.speaker = character; 
	}
	
	public void prompt(String dialogue) { //Method which prints out the speaker then the line of dialogue passed to it. 
		System.out.println(this.speaker + ": " + dialogue);
		//System.out.println("Press enter to continue...");
		this.pause(); //Call pause to add delay between outputs for user readability. 
	}
	
	public void pause() {
		try {
            Thread.sleep(4444);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}