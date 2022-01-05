package org.raj.kotw.core;

import org.raj.kotw.stage.Stage;


/**
 * @author Rene Andre B. Jocsing
 * 
 * StageManager class contains the method for playing stages. Core module.
 *
 */
public class StageManager {
	
	/**
	 * @author Rene Andre B. Jocsing
	 * 
	 * The playStage method simply calls stage object's play() method then helps garbage collector after. 
	 *
	 * @param stage
	 * 		The stage you want to play. 
	 */
	public static void playStage (Stage stage) {
		stage.play();
		stage = null;
		System.out.println("\n");
	}
}
