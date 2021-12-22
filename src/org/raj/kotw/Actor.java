package org.raj.kotw;

import java.util.ArrayList;


/**
 * @author Rene Andre B. Jocsing
 * 
 * Concrete for Monsters and Players. Used for implementing very basic factory pattern. 
 * @see Player
 * @see Monster
 */
public class Actor {
	protected int health;
	protected int attack;
	protected int defense;
	protected int speed;
	protected Weapon weapon; //TODO: Make a weapon class. DONE.
	protected int specialPoints;
	protected int maxHP;
	//protected ArrayList<Weapon> id = new ArrayList<>();  //TODO: Make this into a Weapon array.
	public String name;
	
	//Getter and setter methods. 
	
	public void getDesc() {
		System.out.println("Name: " + this.name);
		System.out.println("Health: " + this.health);
		System.out.println("Special: " + this.specialPoints);
	}
	public String getName() {
		return this.name; 
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public void  setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public void  setDefense(int defense) {
		if(defense < 0) {
			this.defense = 0;
		}
		else{
			this.defense = defense;
		}
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		if (health < 0) { //Guard condition versus setting negative health and above maximum health. 
			this.health = 0;
		} else if (health > this.maxHP || health < this.maxHP){
			this.health = health;
		}
	}
	
	public void setWep(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public Weapon getWep() {
		return this.weapon;
	}
	
	public void addSP(int increment) {
		this.specialPoints += increment;
	}
	
	public int getSP() {
		return this.specialPoints;
	}
	
}