package org.raj.kotw;

import java.util.Scanner;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Class that handles combat situations between two actors. Heavily utilizes strategy design pattern for both player and monster.
 * 
 * @see MoveStrategy
 * 
 */

public class Combat { //Combat class. 
	
	private static int NUM_FIGHTS = 0; //Count number of fights that happen.
	//private Player player; //Actors to be used in fight() method. 
	//private Monster monster;
	
	private Combat(){ //Blank private constructor to reinforce the fact that Combat should be called in a static way. 
		
	}
	
	/**
	 * @author Rene Andre B. Jocsing
	 * 
	 * The fight method makes two actors fight each other until someone's HP reaches 0. Uses strategy design pattern for player actions. Uses mediator design pattern to communicate between player and the program. 
	 * 
	 * @see MoveStrategy
	 */
	
	static void fight (Player player, Monster monster) {
		@SuppressWarnings("resource") 
		Scanner scanMove = new Scanner(System.in); 							//Scanner takes user input for what move to use. 
		String action = "";
		MoveStrategy attack = new MoveGenericAttack(); 						//Initialize strategies for use with strategy design pattern.
		MoveStrategy special = new MoveSpecial(); 
		MoveStrategy run = new MoveRun();  
		//TODO: Implement these strategies. DONE. 
		
		Combat.NUM_FIGHTS += 1;
		System.out.println("");
		System.out.println("A wild " + monster.getName() + " has appeared!!!");
		
		BATTLE: //While both actors' HP are above 0, continue battling. Simple combat game loop. 
		do{
			
			System.out.println(""); 
			player.getDesc();
			
			System.out.println("");
			System.out.println("vs.");
			System.out.println("");
			
			monster.getDesc();
			System.out.println("");
			
			System.out.println("What would you like to do? Choices: [Attack, Special, Run]");
			action = (scanMove.nextLine()).toLowerCase(); //Store user's chosen action into variable ; lower-case cast for uniformity
		
			//PLAYER MOVE
			switch (action) { 
			//We only have 3 actions: generic attack, special attack, and run (run restores HP because knights never run).
			//TODO: Connect behavior to strategies. Implement strategies. DONE.
				case ("attack"):
					Combat.useStrategy(attack, player, monster);
					break;
				case ("special"):
					Combat.useStrategy(special, player, monster);
					break;
				case ("run"):
					Combat.useStrategy(run, player, monster);
					break;
				default:
					System.out.println("Invalid input!!! Try again!!!");
					continue BATTLE;
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
		
		
	}
	
	private static void useStrategy(MoveStrategy strategy, Actor attacker, Actor defender) { 
		//Helper method for strategy design pattern implementation.
		
			strategy.action(attacker, defender);	//Call whatever strategy you want inside this method. 
			
	}
	
}
