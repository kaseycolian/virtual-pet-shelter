import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {

	// instance variables
	private String nameOfPet;
	private String typeOfPet;
	private int hungerLevel;
	private int thirstLevel;
	private int fireLevel;
	private int boredomLevel;

	public VirtualPet(String nameOfPet, String typeOfPet) {
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
		this.hungerLevel = 50;
		this.thirstLevel = 50;
		this.fireLevel = 50;
		this.boredomLevel = 50;

	}

	public VirtualPet(String nameOfPet, String typeOfPet, int hungerLevel, int thirstLevel, int fireLevel,
			int boredomLevel) {
		this(nameOfPet, typeOfPet);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.fireLevel = fireLevel;
		this.boredomLevel = boredomLevel;
	}

	public String getAllLevelsForIndividual() {
		return "The current levels for " + nameOfPet + " are:\nHunger Level: " + hungerLevel + "\nThirst Level: "
				+ thirstLevel + "\nFire Level:  " + fireLevel + "\nBoredom Level: " + boredomLevel;
	}

	public String getNameOfPet() {
		return nameOfPet;
	}

	public String getTypeOfPet() {
		return typeOfPet;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getFireLevel() {
		return fireLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public void playWithOne() {
		int amountToPlay = 6;
		boredomLevel -= amountToPlay;
		int hungrier = 3;
		hungerLevel -= hungrier;
		int thirstier = 3;
		thirstLevel -= thirstier;
	}

	public void feedOne() {
		int amountToFeed = 10;
		hungerLevel = -amountToFeed;
		int thirstier = 3;
		thirstLevel = -thirstier;
		int fierier = 3;
		fireLevel = -fierier;
	}

	public void tickEffectOne() {
		int amountToFeed = 3;
		hungerLevel = +3;
		int thirstier = 3;
		thirstLevel = -thirstier;
		int fierier = 3;
		fireLevel = +fierier;
		int bored = 3;
		boredomLevel = +3;

	}

	public void setNameOfPet(String nameOfPet) {
		this.nameOfPet = nameOfPet;
	}

	public void setTypeOfPet(String typeOfPet) {
		this.typeOfPet = typeOfPet;
	}

	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}

	public void setThirstLevel(int thirstLevel) {
		this.thirstLevel = thirstLevel;
	}

	public void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}

	public void setBoredomLevel(int boredomLevel) {
		this.boredomLevel = boredomLevel;
	}

}
