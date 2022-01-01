package org.raj.kotw.core;

import org.raj.kotw.actor.Monster;
import org.raj.kotw.actor.MonsterBandit;
import org.raj.kotw.actor.MonsterWizard;
import org.raj.kotw.actor.MonsterZombie;

//#TODO: Implement factory pattern for generating monsters. DONE


/**
 * @author Rene Andre B. Jocsing
 * 
 * The FactoryMonster generates and returns a specific monster type for the caller, implementing factory design pattern. Core module.
 *
 */
public class FactoryMonster {
	//Check what type of monster the user wants, generate it, then return it.
	public static Monster generateMonster(String monsterType) {  
		if (monsterType.equals(null)) {
			return null;
		}
		if (monsterType.equals("ZOMBIE")) {
			return new MonsterZombie();
		}
		if (monsterType.equals("BANDIT")) {
			return new MonsterBandit();
		}
		if (monsterType.equals("WIZARD")) {
			return new MonsterWizard();
		} 
		return null;
	}
}
