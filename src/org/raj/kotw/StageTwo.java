package org.raj.kotw;

import java.util.Scanner;

public class StageTwo extends Stage {
	public String name = "Who am I?";
	public int id = 2;
	
	public void play() {
		System.out.println("Level " + this.id + ": " + this.name + "\n");
		
		Scanner playerInput = new Scanner (System.in);
		Player basicallyYou = Player.getInstance();
		Talk narrator = new Talk("MysteriousVoiceInYourHead");
		Narration genericAsk = new Narration(); 
		
		narrator.prompt("You find a weapon.");
		
		Weapon realKnife = new DecoratorSilver (new WeaponKnife());
		
		basicallyYou.setWep(realKnife);
		
		MonsterZombie zombo = new MonsterZombie();
		
		Combat.fight(basicallyYou, zombo);
		
	}
}
