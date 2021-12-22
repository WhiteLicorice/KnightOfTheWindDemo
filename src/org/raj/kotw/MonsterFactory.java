package org.raj.kotw;

//#TODO: Implement factory pattern for generating monsters. DONE


/**
 * @author Rene Andre B. Jocsing
 * 
 * The MonsterFactory generates and returns a specific monster type for the caller, implementing factory design pattern.
 *
 */
public class MonsterFactory {
	public Monster generateMonster(String monsterType) { //Check what type of monster the user wants, generate it, then return it. 
		if (monsterType.equals(null)) {
			return null;
		}
		if (monsterType.equals("ZOMBIE")) {
			return new MonsterZombie();
		}
		if (monsterType.equals("BANDIT")) {
			return new MonsterBandit();
		}
		return null;
	}
}
