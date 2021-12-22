package org.raj.kotw;

import java.util.Scanner;

public class StageOne extends Stage {
	public String name = "Introduction";
	public int id = 1;
	
	public void play() {
		
		System.out.println("Level "+this.id+": "+this.name+"\n");
		
		Scanner playerInput = new Scanner (System.in); //Initialize objects to be used in the stage. 
		Player basicallyYou = Player.getInstance();
		Talk narrator = new Talk("MysteriousVoiceInYourHead");
		Narration genericAsk = new Narration (); 
		
		Talk profTree = new Talk("Professor Tree");
		
		profTree.prompt("Hello and welcome to the Fantasy Kitchen Sink!!!");
		profTree.prompt("I'm Professor Tree—which you'd know if you read the name tag—and I'll be your guide as you embark on your journey to become a Poke—!");
		profTree.prompt("Ooops, wrong franchise. A-hem! Anyway, what is your name?"); 
		
		genericAsk.prompt ("Please type in your first name. Never type in your last name into sketchy programs like this one." ); 
		basicallyYou.setName(playerInput.nextLine().trim()); 
		
		profTree.prompt("So you're " + basicallyYou.getName() + ". Nice to meet you!");
		profTree.prompt("In this world, zombies, vampires, and leprechauns live together in peace.");
		profTree.prompt("Nah. I'm just kidding you. It's totally The Purge out there.");
		profTree.prompt("Good luck, and try to make it to the end of the beta.");
		
		narrator.prompt("As you walk out of the lab, you ask yourself the most important question of all—who am I?");
		narrator.prompt("Not your name. 'Names are pretty but useless,' you think as you cling to the wall.");
		narrator.prompt("Professor Tree's words echo in your head—kind of like me if you think about it.");
		narrator.prompt("If there are vampires in this strange new world, you'll need to remember what you can do.");
		
		System.out.print("\n");
		
	}
}
