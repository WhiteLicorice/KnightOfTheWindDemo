package org.raj.kotw.special;

import org.raj.kotw.actor.Actor;
import org.raj.kotw.weapon.Weapon;

/**
 * @author Rene Andre B. Jocsing
 * 
 * Interface for weapon special moves. 
 *
 */
public interface Special {
	void doSpecial(Weapon weapon, Actor attacker, Actor defender);
}
