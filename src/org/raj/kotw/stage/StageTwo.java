package org.raj.kotw.stage;

import org.raj.kotw.actor.Player;
import org.raj.kotw.core.Combat;
import org.raj.kotw.core.FactoryMonster;
import org.raj.kotw.core.Narration;
import org.raj.kotw.core.Talk;
import org.raj.kotw.weapon.DecoratorIron;
import org.raj.kotw.weapon.DecoratorSilver;
import org.raj.kotw.weapon.WeaponKnife;
import org.raj.kotw.weapon.WeaponSword;


/**
 * @author Rene Andre B. Jocsing
 * 
 * StageTwo tests the user's understanding of the combat system. It features a boss fight and the end of the demo. 
 *
 */
public class StageTwo extends Stage {
	private String name = "Chapter 2";
	private int id = 2;
	
	@Override
	public void play() {
		@SuppressWarnings("resource")
		//Note: We use the underlying stream all throughout the program so we cannot close any scanner manually. We should let Java close it on its own. 
		Player knight = Player.getInstance();
		Narration narrator = new Narration (); 
		Talk necroTalk = new Talk("Necromancer");
		
		narrator.prompt("Level " + this.id + ": " + this.name+"\n");

		narrator.prompt("Night falls and your quest continues.");
		narrator.prompt("'Best watch the graveyard,' you think.");
		narrator.prompt("You make your way there, huddling behind a particularly stout tombstone.");
		narrator.prompt("Hours pass and your legs are starting to cramp (no amount of knightly training can stave that off).");
		narrator.prompt("When the bell strikes midnight, you briefly consider going back to the inn and finding a room to get some proper rest."); 
		narrator.prompt("Fortunately—or unfortunately—you notice a robed man skulking into the graveyard.");
		narrator.prompt("'What could an elderly man armed with a staff be doing here at such an hour?' you think.");
		
		narrator.prompt("You announce your presence with a holler, giving voice to your question. And perhaps also your suspicions.");
		necroTalk.prompt("You! Ser Knight! Now that you have seen me, I cannot possibly let you live!");
		narrator.prompt("'Typical,' you think.");
		narrator.prompt("You draw your sword—");
		narrator.prompt("It flies from your hand, the necromancer swishing his staff.");
		knight.setWep(null); //Disarm effect.
		narrator.prompt("Having been effectively disarmed, you reach for the trusty knife hidden in your boot.");
		knight.setWep(new DecoratorSilver(new WeaponKnife())); //Re-arm, use silver decorator on knife weapon.
		necroTalk.prompt("Mwahahaha! You would do battle with such a flimsy knife?");
		narrator.prompt("'This flimsy knife's made of silver,' you think. 'I'll show him.'");
		narrator.prompt("Considering how your weapon has change, you should try another strategy.");
		knight.getWep().dispStats();
		narrator.prompt("");
		narrator.prompt("");
		narrator.prompt("");
		narrator.prompt("");
		narrator.prompt("");
		
		Combat.fight(knight, FactoryMonster.generateMonster("WIZARD"));
		
		necroTalk.prompt("No! It cannot end like this!");
		narrator.prompt("Another zombie rises from the earth, hewn from, as far as you can tell, the last of the necromancer's energies.");
		
		Combat.fight(knight, FactoryMonster.generateMonster(("ZOMBIE")));
		
		narrator.prompt("The zombie falls down, defeated. But the necromancer is nowhere to be seen.");
		narrator.prompt("Despite the lack of necromancer blood on your knife, your mission is successful.");
		narrator.prompt("Now, you must return to Ventus, to your lord, and report your findings.");
		
		narrator.prompt("");
		
		narrator.prompt("Congratulations! You've reached the end of the demo!");
		
		knight.setHealth(knight.getMaxHP());	//Return player HP and SP back to default. End of demo reached. 
		knight.addSP(-knight.getSP());
		knight.setWep(new DecoratorIron (new WeaponSword()));
		
		//Dereference used objects. Help garbage collector.  
		knight = null;
		narrator = null; 
		necroTalk = null;
		
	}
}
