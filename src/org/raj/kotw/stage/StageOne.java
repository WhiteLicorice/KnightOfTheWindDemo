package org.raj.kotw.stage;

import java.util.Scanner;



import org.raj.kotw.actor.Player;
import org.raj.kotw.core.Combat;
import org.raj.kotw.core.FactoryMonster;
import org.raj.kotw.core.Narration;
import org.raj.kotw.core.Talk;

/**
 * @author Rene Andre B. Jocsing
 * 
 * StageOne lets the player input their name for customization and have a taste of the combat system in the demo. 
 * 
 *
 */

public class StageOne extends Stage {
	private String name = "Chapter 1";
	private int id = 1;
	
	@Override
	public void play() {
		
		@SuppressWarnings("resource")
		//Note: We use the underlying stream all throughout the program so we cannot close any scanner manually. We should let Java close it on its own. 
		Scanner pInput = new Scanner (System.in); //Initialize objects to be used in the stage. 
		Player knight = Player.getInstance();
		Narration narrator = new Narration (); 
		Talk highwaymanTalk = new Talk("Highwayman");
		
		narrator.prompt("Level " + this.id + ": " + this.name+"\n");
				
		narrator.prompt("You are a knight in service to the Kingdom of Ventus, the western kingdom of Arcadia.");
		narrator.prompt("As a person of relative unimportance, your lord has tasked you with resolving a conflict in the small town of Porkwall.");
		narrator.prompt("They say that the dead have risen, gone mad. While you believe little in fairy tales and folk gossip,");
		narrator.prompt("it doesn't change your mission in any way. You must determine the truth of these rumors,");
		narrator.prompt("and bring back peace and security to the kingdom's subjects. You swear it on your honor as Ser...");
		
		narrator.prompt("(Please input your desired name)"); //User inputs name here. 
		knight.setName(pInput.nextLine());
		
		narrator.prompt("...Ser " + knight.getName() + " of Ventus.");
		
		narrator.prompt("A raspy voice snaps you out of your musings.");
		
		highwaymanTalk.prompt("Halt!");
		
		narrator.prompt("You ask the highwayman what is the matter.");
		
		highwaymanTalk.prompt("This here's a toll road, you see. Fifty shillings or you'll have to turn around!");

		narrator.prompt("'Bold for a highwayman,' you think. A knight never runs from villains so you draw your sword and face the lone bandit.");
		
		Combat.fight(knight, FactoryMonster.generateMonster("BANDIT")); 
		//Call factory to generate monster then pass to Combat with player; start a fight.
		
		narrator.prompt("The battle was hard-fought but you managed to pull through.");
		narrator.prompt("You imagine that this is not the first of your adversaries on this quest.");
		narrator.prompt("You sheathe your sword and jog away from the battlefield.");
		narrator.prompt("Soon enough, you reach the beaten gates of Porkwall.");
		narrator.prompt("A quick visit to the tavern, for information and a little bit of drink, provides you with clues.");
		narrator.prompt("The clues to the graveyard, where numerous bodies have been unearthed.");
		narrator.prompt("When you examine one of the graves, you find that it hasn't been dug out.");
		narrator.prompt("'It's been clawed at from the inside,' you think. There are marks raked into the packed soil reminiscent of nails.");
		narrator.prompt("'Human nails,' you think. And here you thought that the villagers were merely pulling a prank.");
		narrator.prompt("A low moan as if it were a man roused from his slumber echoes in the wind, the bushes rustling behind.");
		
		Combat.fight(knight, FactoryMonster.generateMonster("ZOMBIE"));
		
		narrator.prompt("Luckily, the half-rotted corpse deals little damage to you with its decaying appendages.");
		narrator.prompt("'But it had dark magic,' you think. For a moment there, the zombie struck at you wih malevolent force.");
		narrator.prompt("Its wounds closed before your eyes.");
		narrator.prompt("It's not alone. Another zombie creeps up from the brush.");
		
		Combat.fight(knight, FactoryMonster.generateMonster("ZOMBIE"));
		
		narrator.prompt("Much as you are loathe to admit, that was a difficult fight.");
		narrator.prompt("These zombies are creatures of dark magic, capable of outlasting your blows and healing from their wounds.");
		narrator.prompt("You glance at your flask of red, taking a chug of the healing liquid.");
		knight.setHealth(knight.getMaxHP() - 10); //Set health to 40/50 for immersion purposes.
		narrator.prompt("You will need it for the foes about to come next.");
		
		pInput = null; 			//Dereference objects at the end of the stage. Help garbage collector. 
		knight = null;
		narrator = null; 
		highwaymanTalk = null;

	}
}
