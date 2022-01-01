package org.raj.kotw.actor;

import org.raj.kotw.weapon.Weapon;
import org.raj.kotw.weapon.WeaponRustedSword;

/**
 * @author Rene Andre B. Jocsing
 * 
 * The MonsterBandit class contains data for the "Bandit" monster, one of the enemies encountered in-game. 
 * 
 * @see Monster
 *
 */
public class MonsterBandit extends Monster {
	private int maxHP = 25;
	private int health = 20;
	private int attack = 5;
	private int defense = 7;
	private int speed = 8;
	private int specialPoints = 10;
	private Weapon weapon = new WeaponRustedSword();
	private String name = "Bandit";
	
	//Getter and setter methods. Self-explanatory. Don't need JavaDoc.
	
	public void getDesc() {
		System.out.println("Name: " + this.name);
		System.out.println("Health: " + this.health + "/" + this.maxHP);
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
		} else if (this.health >= this.maxHP) {
			this.health = this.maxHP;
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

