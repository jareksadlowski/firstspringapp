package pl.sygnity.test.util;

/*
 * Klasa definiująca zawodnika z pola oraz jego umiejętności
 */
public class FieldPlayer extends Player {
	
	// podawanie
	private int passing;
	
	// technika
	private int technique;
	
	// szybkość
	private int speed;
	
	// wytrzymałość
	private int stamina;

	public FieldPlayer(String firstName, String lastName, int age, int passing, int technique, int speed, int stamina) {
		super(firstName, lastName, age);
		this.passing = passing;
		this.technique = technique;
		this.speed = speed;
		this.stamina = stamina;
	}

	public int getPassing() {
		return this.passing;
	}

	public void setPassing(int passing) {
		this.passing = passing;
	}

	public int getTechnique() {
		return this.technique;
	}

	public void setTechnique(int technique) {
		this.technique = technique;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStamina() {
		return this.stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
}
