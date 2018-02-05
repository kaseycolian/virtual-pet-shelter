import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {

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
		boredomLevel = boredomLevel - 10;
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		if (boredomLevel - 10 <= 10) {
			boredomLevel = 0;
		}
	}

	public void feedOne() {
		hungerLevel = hungerLevel - 10;
		thirstLevel = thirstLevel + 3;
		fireLevel = fireLevel + 3;
		if (hungerLevel - 10 <= 0) {
			hungerLevel = 0;
		}
	}

	public void waterOne() {
		thirstLevel = thirstLevel - 10;
		hungerLevel = hungerLevel + 3;
		fireLevel = fireLevel + 3;
		if (thirstLevel - 10 <= 0) {
			thirstLevel = 0;
		}
	}

	public void fireOne() {
		fireLevel = fireLevel - 10;
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		if (fireLevel - 10 <= 0) {
			fireLevel = 0;
		}
	}

	public void tickEffectOne() {
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		fireLevel = fireLevel + 3;
		boredomLevel = boredomLevel + 3;

	}
}
