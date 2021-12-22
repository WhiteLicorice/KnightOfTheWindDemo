package org.raj.kotw;
import java.util.*;


//TODO: Rework Monster class. DONE.
//TODO: Write AI Manager
//TODO: Finish three stages.

public class Main {

	public static void main(String[] args) {
		// Mostly used for talk events in the game and setting general system objects. 
		
		ContinueGame contFlag = ContinueGame.getInstance();
		Narration genericSysPrompt = new Narration();
		Scanner genericSysScan = new Scanner(System.in);
		String genericAnswerString;
		
		do { //Game loop
			
			StageOne stageOneInstance = new StageOne(); // Every time a stage is loaded, the following steps occur:
			stageOneInstance.play();				// 1) A StageN object is instantiated. 2) the play method is called
			stageOneInstance = null;					// and 3) the instance is made available for garbage collection once stage is finished. 
			
			StageTwo stageTwoInstance = new StageTwo();
			stageTwoInstance.play();
			stageTwoInstance = null;
			
			genericSysPrompt.prompt("Do you wish to undergo the journey again? Yes or No?"); 
			genericAnswerString = genericSysScan.nextLine();
			contFlag.setFlag(genericAnswerString);
			
		}while(contFlag.getFlag() == true);

		genericSysScan.close();
	}

}
