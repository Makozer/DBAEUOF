package game.research;

import java.util.ArrayList;

/** This class saves and represents the Players TechTree.
 * @author Martin
 *
 */
public class TechTree {
	
	ArrayList<AResearch> attack = new ArrayList<AResearch>();

	public static void main(String[] args) {
		// Testmain
	}
	
	public void addAttackResearch(AResearch research) {
		attack.add(research);
	}
	
	public double getAttack() {
		double output = 0;
		for (AResearch r: attack) {
			output += r.getValue();
		}
		return output;
	}

}
