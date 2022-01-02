package org.raj.kotw;
import java.util.*;

import org.raj.kotw.core.ContinueGame;
import org.raj.kotw.core.Narration;
import org.raj.kotw.core.StageManager;
import org.raj.kotw.stage.StageOne;
import org.raj.kotw.stage.StageTwo;



/**
 * @author Rene Andre B. Jocsing
 *
 * The main class mainly serves as a vehicle to launch stages and contains a rudimentary game loop asking whether the player wants to repeat the game.
 */

public class Main {
	
	//main method
	public static void main(String[] args) {
		
		ContinueGame contFlag = ContinueGame.getInstance();
		Narration genericSysPrompt = new Narration();
		Scanner genericSysScan = new Scanner(System.in);
		String genericAnswerString;
		
		do { //Game loop
			
			StageManager.playStage(new StageOne()); //Play stages anonymously. 
			StageManager.playStage(new StageTwo());
			
			genericSysPrompt.prompt("Do you wish to undergo the journey again? Yes or No?"); 
			genericAnswerString = genericSysScan.nextLine();
			contFlag.setFlag(genericAnswerString);
			
		} while(contFlag.getFlag() == true);

		genericSysScan.close();
	}

}
