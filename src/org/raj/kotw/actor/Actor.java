package org.raj.kotw.actor;

import org.raj.kotw.weapon.Weapon;


/**
 * @author Rene Andre B. Jocsing
 * 
 * Superclass for Monsters and Players. Used for polymorphism throughout the demo.
 *
 * @see Player
 * @see Monster
 */
public class Actor {
	private int health;
	private int attack;
	private int defense;
	private int speed;
	private Weapon weapon; //TODO: Make a Weapon class. Implement decorator design pattern. DONE.
	private int specialPoints;
	private int maxHP;
	private String name;
	
	//Generic getter and setter methods. Self-explanatory. No need JavaDoc. 
	
	public void getDesc() {
		System.out.println("Name: " + this.name);
		System.out.println("Health: " + this.health);
		System.out.println("Special: " + this.specialPoints);
	}
	public String getName() {
		return this.name; 
	}
	
	public int getMaxHP() {
		return this.maxHP;
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