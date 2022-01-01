package org.raj.kotw.core;

/**
 * @author Rene Andre B. Jocsing
 * 
 * The Narration class handles printing narration without speakers or have unknown speakers. Core module. 
 *
 */
public class Narration implements Printer {
	
	@Override
	public void prompt(String query) {
		System.out.println(query);
		this.pause();
	} //Prints the text passed to prompt() then calls pause() to insert delay between inputs/outputs. 
	
	public void pause() {
		try {
            Thread.sleep(4444); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}

