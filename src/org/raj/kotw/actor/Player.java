package org.raj.kotw.actor;

import org.raj.kotw.weapon.DecoratorIron;
import org.raj.kotw.weapon.Weapon;
import org.raj.kotw.weapon.WeaponSword;

/**
 * @author Rene Andre B. Jocsing
 * The player singleton. Contains player data that carries over in-between stages. 
 *
 */
public class Player extends Actor {	//Singleton for Player. 
	
	private static Player you; //Instance of Player singleton.
	private static String name = "Nyte"; //Default name. 
	private static Weapon weapon = new DecoratorIron (new WeaponSword()); //Starting weapon.
	private static int attack = 10;
	private static int defense = 7;
	private static int speed = 4;
	private static int health = 50;
	private static int specialPoints = 0;
	private static int maxHP = 50; 
	
	//Singleton constructor.
	public static Player getInstance()
    {
        if (you == null)
        	you = new Player();
        return you;
    }
	
	//Getter and setter methods. Self-explanatory. Don't need JavaDoc.
	
	public int getMaxHP() {
		return Player.maxHP;
	}
	
	public void setWep(Weapon weapon) {
		if (weapon != null) {
			Player.weapon = weapon;
		}
	}
	
	public Weapon getWep() {
		return Player.weapon;
	} 

	public void getDesc() {
		System.out.println("Name: " + Player.name);
		System.out.println("Health: " + Player.health + "/" + Player.maxHP);
		System.out.println("Special: " + Player.specialPoints);
	}
	public String getName() {
		return Player.name; 
	}
	
	public int getAttack() {
		return Player.attack;
	}
	
	public void  setAttack(int attack) {
		Player.attack = attack;
	}
	
	public int getDefense() {
		return Player.defense;
	}
	
	public void  setDefense(int defense) {
		if(defense < 0) {
			Player.defense = 0;
		}
		else{
			Player.defense = defense;
		}
	}
	
	public int getSpeed() {
		return Player.speed;
	}
	
	public void setSpeed(int speed) {
		Player.speed = speed;
	}
	
	public int getHealth() {
		return Player.health;
	}
	
	public void setHealth(int health) {
		if (health < 0) { //Guard condition versus setting negative health and above maximum health. 
			Player.health = 0;
		} else if (health > Player.maxHP) {
			Player.health = Player.maxHP;
		} else {
			Player.health = health;
		}
	}
	
	public void addSP(int increment) {
		Player.specialPoints += increment;
	}
	
	public int getSP() {
		return Player.specialPoints;
	}
	
	public void setName (String name) {
		Player.name = name; 
	}
}
