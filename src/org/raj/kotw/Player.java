package org.raj.kotw;

import java.util.ArrayList;

/**
 * @author Rene Andre B. Jocsing
 * The Player Singleton. Contains player data that carries over in between stages. 
 */
class Player extends Actor {	//Singleton for Player. 
	
	private static Player you = null;
	private static String name;
	//private static String job;
	private static Weapon weapon = new WeaponKnife();
	private static int attack = 3;
	private static int defense = 3;
	private static int speed = 3;
	private static int health = 30;
	private static int specialPoints = 3;
	private static int maxHP = 30; 
	//private static ArrayList<Weapon> inventory = new ArrayList<>();
	
	//Singleton constructor.
	
	public static Player getInstance()
    {
        if (you == null)
        	you = new Player();
        return you;
    }
	
	//Getters and setters. 
	
	public void setWep(Weapon weapon) {
		if (weapon != null) {
			Player.weapon = weapon;
		}
	}
	
	public Weapon getWep() {
		return Player.weapon;
	} 
	
	/*
	 * public void addWep(Weapon weapon) { Player.inventory.add(weapon); }
	 * 
	 * public void upgradeWep(Weapon weapon) { for (Weapon wep : Player.inventory) {
	 * if (wep.getType().equals(weapon.getType())) { if (wep.getDamage() <
	 * weapon.getDamage()) { int index = Player.inventory.indexOf(wep);
	 * Player.inventory.add(index, weapon); Player.inventory.remove(wep); if
	 * (this.getWep().equals(wep)) { this.setWep(weapon); } return; } } }
	 * System.out.println("");
	 * System.out.println("You already have this upgrade!!! Or a better one!!!");
	 * System.out.println(""); }
	 */

	public void getDesc() {
		System.out.println("Name: " + Player.name);
		System.out.println("Health: " + Player.health);
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
		} else if (health > Player.maxHP || health < Player.maxHP){
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
