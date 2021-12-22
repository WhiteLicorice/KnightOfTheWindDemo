package org.raj.kotw;



/**
 * @author Rene Andre B. Jocsing
 * 
 * The Narration class handles narration without speakers or have unknown speakers. 
 *
 */
public class Narration implements DialoguePrinter {
	
	@Override
	public void prompt(String query) {
		System.out.println(query);
		this.pause();
	} //Prints the text passed to prompt() then calls pause() to insert delay between inputs/outputs. 
	
	public void pause() {
		try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}

