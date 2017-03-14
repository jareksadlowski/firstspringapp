package pl.sygnity.test.util;

/*
 * Klasa definiująca bramkarza oraz jego umiejętności
 */
public class GoalKeeper extends Player {

	// łapanie piłki
	private int handling;
	
	// umiejętność gry w powietrzu
	private int aerialAbility;

	public GoalKeeper(String firstName, String lastName, int age, int handling, int aerialAbility) {
		super(firstName, lastName, age);
		this.handling = handling;
		this.aerialAbility = aerialAbility;
	}

	public int getHandling() {
		return this.handling;
	}

	public void setHandling(int handling) {
		this.handling = handling;
	}

	public int getAerialAbility() {
		return this.aerialAbility;
	}

	public void setAerialAbility(int aerialAbility) {
		this.aerialAbility = aerialAbility;
	}

}
