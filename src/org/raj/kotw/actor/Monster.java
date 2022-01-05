package org.raj.kotw.actor;


/**
 * @author Rene Andre B. Jocsing
 *
 * Generic monster abstraction used as a guide. Set stats for each monster manually or with some random seed. 
 */
public abstract class Monster extends Actor {
	private int health;
	private int attack;
	private int defense;
	private int speed;
	private int specialPoints;
	private int maxHP;
	private String name;
	
	//Generic getter and setter methods. 
	
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
	
	
	public void addSP(int increment) {
		this.specialPoints += increment;
	}
	
	public int getSP() {
		return this.specialPoints;
	}
	
}