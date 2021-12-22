package org.raj.kotw;

/**
*
* Interface for weapons. Used for decorator pattern.
*
*/

public interface Weapon { //Used for decorator pattern. 
	int getDamage();
	int getCost();
	String getType();
	void dispStats();
}
