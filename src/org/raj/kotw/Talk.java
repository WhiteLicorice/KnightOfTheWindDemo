package org.raj.kotw;



/**
 * @author Rene Andre B. Jocsing
 * 
 * Class for named dialogue. Contains methods for outputting dialogue in script format and delaying between lines.
 * @See {@link #pause()} {@link #prompt(String)}
 * 
 *
 */
public class Talk implements DialoguePrinter {
	String speaker; //Declare a speaker String. Used to hold the name of the actor currently speaking—particularly in the constructor.
	
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
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}