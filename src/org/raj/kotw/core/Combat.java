package org.raj.kotw.core;

import java.util.Scanner;

import org.raj.kotw.actor.Actor;
import org.raj.kotw.actor.Monster;
import org.raj.kotw.actor.Player;
import org.raj.kotw.move.MoveGenericAttack;
import org.raj.kotw.move.MoveRun;
import org.raj.kotw.move.MoveSpecial;
import org.raj.kotw.move.MoveStrategy;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Class that handles combat situations between two actors. Core module. Heavily utilizes strategy design pattern for both player and monster actions.
 * 
 */

public class Combat { //Combat class. 
	
	//Blank private constructor to reinforce the fact that Combat should be called in a static way. 
	private Combat(){ 
		
	}
	
	/**
	 * @author Rene Andre B. Jocsing
	 * 
	 * The fight method makes two actors fight each other until someone's HP reaches 0.
	 * It serves as the core of the combat system, containing a combat loop. 
	 * Uses strategy design pattern for player actions. 
	 * Uses mediator design pattern to communicate between player and the program. 
	 * 
	 * @param player
	 * 		The player.
	 * @param monster
	 * 		The monster fighting the player
	 * 
	 */
	
	public static void fight (Player player, Monster monster) {
		@SuppressWarnings("resource") 
		Scanner scanMove = new Scanner(System.in); 							//Scanner takes user input for what move to use. 
		String action = "";
		MoveStrategy attack = new MoveGenericAttack(); 						//Initialize strategies for use with strategy design pattern.
		MoveStrategy special = new MoveSpecial(); 
		MoveStrategy run = new MoveRun();  
		//TODO: Implement these strategies. DONE. 
		
		System.out.println("");
		System.out.println("A wild " + monster.getName() + " appeared!!!");
		
		BATTLE: //While both actors' HP are above 0, continue battling. Simple combat game loop. 
		do{
			
			//Print out introduction to battle with actor's getDesc() method.
			
			System.out.println(""); 
			player.getDesc();
			
			System.out.println("");
			System.out.println("vs.");
			System.out.println("");
			
			monster.getDesc();
			System.out.println("");
			
			System.out.println("What would you like to do? Choices: [A for Attack, S for Special, R for Run]");
			action = (scanMove.nextLine()).toLowerCase(); //Store user's chosen action into variable ; lower-case cast for uniformity
		
			//PLAYER MOVE
			switch (action) { 
			//We only have 3 actions: generic attack, special attack, and run (run restores HP because knights never run).
			//TODO: Connect behavior to strategies. Implement strategies. DONE.
				case ("a"):
					Combat.useStrategy(attack, player, monster);
					break;
				case ("s"):
					Combat.useStrategy(special, player, monster);
					break;
				case ("r"):
					Combat.useStrategy(run, player, monster);
					break;
				default:
					System.out.println("Invalid input!!! Try again!!!");
					continue BATTLE; //On invalid input, use label to restart combat loop.
			}
			
			player.addSP(1); //Player regenerates 1 SP per turn. 
			
			//TODO: Make AI. Call AI. DONE.
			if (monster.getHealth() != 0) {							 //Guard condition versus dead monster.
				if (monster.getSP() >= monster.getWep().getCost()) { 
					Combat.useStrategy(special, monster, player);    //Monsters always use special move when fully charged.
				}
				else {
					Combat.useStrategy(attack, monster, player);    
				}
				monster.addSP(1);									//Monsters regenerate 1 SP per turn.
			}
	
		} while ((player.getHealth() > 0) && (monster.getHealth() > 0));
		
		assess (player, monster); //Check results of combat with private helper method. 
	
	}
	
	
	/**
	 * @author Rene Andre B. Jocsing
	 * 
	 * Private checker method that checks if either the monster or the player died after the fight() method and decides whether to end with a game over.
	 *
	 * @param player
	 * 		The player.
	 * @param monster
	 * 		The monster fighting the player
	 */
	
	private static void assess (Player player, Monster monster) { 
		if (player.getHealth() == 0) {
			System.out.println("Unfortunately, you have fallen, and without you, brave knight, the world will fall into chaos. GAME OVER!!!");
			System.exit(0); //Upon game over, just stop program execution. 
		}
		else if (monster.getHealth() == 0) {
			System.out.println("");
			System.out.println("Congratulations! You emerged victorious!!!");
			System.out.println("");
		}
	}
	
	/**
	 * @author Rene Andre B. Jocsing
	 * 
	 * Private helper method for calling attack strategies. Used to implement strategy design pattern.
	 * 
	 * @param strategy
	 * 		The strategy you want to use.
	 * @param attacker
	 * 		The one using the strategy.
	 * @param defender
	 * 		The one the strategy is being used on (except in the case of attacker's self-target moves).
	 *
	 */
	
	private static void useStrategy(MoveStrategy strategy, Actor attacker, Actor defender) { 
		//Helper method for strategy design pattern implementation.
		
			strategy.action(attacker, defender);	//Call whatever strategy you want inside this method. 
			
	}
	
}
