package org.raj.kotw.actor;

import org.raj.kotw.weapon.Weapon;
import org.raj.kotw.weapon.WeaponWizardWand;



/**
 * @author Rene Andre B. Jocsing
 * 
 * The MonsterWizard class contains data for the "Wizard" monster, one of the enemies encountered in-game.
 *
 */
public class MonsterWizard extends Monster {
	private int maxHP = 30;
	private int health = 30;
	private int attack = 10;
	private int defense = 3;
	private int speed = 10;
	private int specialPoints = 30;
	private Weapon weapon = new WeaponWizardWand();
	private String name = "Wizard";
	
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