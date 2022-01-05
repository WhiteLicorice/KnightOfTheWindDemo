package org.raj.kotw.weapon;

/**
* 
* @author Rene Andre B. Jocsing
* Interface for weapons. Used for decorator design pattern. Used in game as a vehicle for special attacks.  
*
*/

public interface Weapon { //Used for decorator pattern. 
	int getDamage();
	int getCost();
	String getType();
	void dispStats();
}
