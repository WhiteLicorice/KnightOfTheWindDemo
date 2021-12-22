package org.raj.kotw;


/**
 * @author Rene Andre B. Jocsing
 * 
 * The MonsterZombie class contains data for the "Zombie" monster, one of the enemies encountered in-game. Zombies have high health and defenses.
 * 
 * @see Monster
 *
 */
public class MonsterZombie extends Monster {
	private int maxHP = 20;
	private int health = 20;
	private int attack = 5;
	private int defense = 8;
	private int speed = 1;
	private int specialPoints = 5;
	private Weapon weapon = new WeaponZombieClaws();
	private String name = "Zombie";
	
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
	
	public void setDefense(int defense) {
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
		this.health = health;
		if (this.health < 0) {
			this.health = 0;
		}
	}

	public void addSP(int increment) {
		this.specialPoints += increment;
		if (this.specialPoints < 0) {
			this.specialPoints = 0;
		}
	}
	
	public int getSP() {
		return this.specialPoints;
	}
	
	public Weapon getWep() {
		return this.weapon;
	}
	
}
