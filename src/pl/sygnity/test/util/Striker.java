package pl.sygnity.test.util;

/*
 * Klasa definiująca napastnika oraz jego umiejętności
 */
public class Striker extends FieldPlayer {
	
	// skuteczność
	private int finishing;

	public Striker(String firstName, String lastName, int age, int passing, int technique, int speed, int stamina, int finishing) {
		super(firstName, lastName, age, passing, technique, speed, stamina);
		this.finishing = finishing;
	}

	public void setFinishing(int finishing) {
		this.finishing = finishing;
	}

	public int getFinishing() {
		return finishing;
	}

}
