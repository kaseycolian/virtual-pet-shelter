import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {

	// instance variables
	private String nameOfPet;
	private String typeOfPet;
	// private boolean gameRunning;
	private int hungerLevel;
	private int thirstLevel;
	private int fireLevel;
	private int boredomLevel;

	// first constructor = behavior of pet userEnteredName is parameter

	public VirtualPet(String userEnteredNameOfPet, String typeOfPet) {// removed from constructor and entered into 2nd:
																		// userEnteredNameOfPet int hungerLevel, int
																		// thirstLevel, int fireLevel, int boredeomLevel
		this.nameOfPet = userEnteredNameOfPet;// beginninngName
		this.typeOfPet = typeOfPet;

	}

	// Second constructor
	public VirtualPet(String userEnteredNameOfPet, String typeOfPet, int hungerLevel, int thirstLevel, int fireLevel,
			int boredomLevel) {
		this(userEnteredNameOfPet, typeOfPet);
		this.hungerLevel = ThreadLocalRandom.current().nextInt(15, 45);
		this.thirstLevel = ThreadLocalRandom.current().nextInt(20, 50);
		this.fireLevel = ThreadLocalRandom.current().nextInt(10, 50);
		this.boredomLevel = ThreadLocalRandom.current().nextInt(10, 50);
	}

	public String getUserEnteredNameOfPet() {
		return nameOfPet;
	}

	public String gettypeOfPet() {
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

	public void tickEffectForAll() {
		if (fireLevel >= 0 && fireLevel <= 55) {
			fireLevel =+ 4;
		}
		if (hungerLevel >= 0 && hungerLevel <= 55) {
			hungerLevel =+ 4;
		}
		if (thirstLevel >= 0 && thirstLevel <= 55) {
			thirstLevel = thirstLevel + 4;
		}if (boredomLevel >=0 && boredomLevel<=50) {
			boredomLevel += 4;
		} else if (fireLevel > 55 || hungerLevel > 55 || thirstLevel > 55 || boredomLevel > 55) {
			int randomEffect = ThreadLocalRandom.current().nextInt(1, 8);
			fireLevel += randomEffect;
			hungerLevel =+ randomEffect;
			thirstLevel =+ randomEffect;
			boredomLevel =+ boredomLevel+randomEffect;
		}
	}
}
