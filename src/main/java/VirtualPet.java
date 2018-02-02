import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {

	// instance variables
	private String nameOfPet;
	private String typeOfPet;
	// private boolean gameRunning; //only put in app, don't declare in shelter or virtualpet.
	private int hungerLevel;
	private int thirstLevel;
	private int fireLevel;
	private int boredomLevel;

	public VirtualPet(String userEnteredNameOfPet, String typeOfPet) {// removed from constructor and entered into 2nd:
																		// userEnteredNameOfPet int hungerLevel, int
																		// thirstLevel, int fireLevel, int boredeomLevel
		this.nameOfPet = userEnteredNameOfPet;// beginninngName
		this.typeOfPet = typeOfPet;

	}

	// Second constructor //switch to 0 default value for testing before adding random.  put note that test passed with 0 default(no random)
	public VirtualPet(String userEnteredNameOfPet, String typeOfPet, int hungerLevel, int thirstLevel, int fireLevel,
			int boredomLevel) {
		this(userEnteredNameOfPet, typeOfPet);
		this.hungerLevel = ThreadLocalRandom.current().nextInt(15, 45);
		this.thirstLevel =ThreadLocalRandom.current().nextInt(20, 50);
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


}
