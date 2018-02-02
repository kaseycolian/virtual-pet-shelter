import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPetShelter {

	private Map<String, String> animals = new HashMap<String, String>();
	public Set<String> nameOfPet = animals.keySet();

	// public void add(String key, String VirtualPet) {
	//// animals.put(animal.getUserEnteredNameOfPet(), animal);
	// animals.put(key, VirtualPet);
	// }

	public Collection<String> animals() {
		return animals.values();
	}

	public void adopt(String userEnteredNameOfPet) {// If end up assigning a unique code for each animal, will need to
													// change key variable.
		animals.remove(userEnteredNameOfPet);
	}

	public void feedIndividual(String nameOfPet, int hungerLevel, int fireLevel) {
		if (-10 <= 0) {
			hungerLevel = 0;
			// makeTheDragon();
			System.out.println(nameOfPet + " is stuffed and cannot fit anymore creatures in its belly!");
			// } else {
			// hungerLevel =- 10;
			// fireLevel =+ 5;
			System.out.println("Thank you for feeding " + nameOfPet + "!");
		}
	}

	public void waterIndividual(String nameOfPet, int thirstLevel, int fireLevel) {// Water Individual
		if (thirstLevel - 10 <= 10) {
			thirstLevel = 0;
			// makeTheDragon();
			System.out.println(
					nameOfPet + " is full of Elven tears and won't be able to breath flames if it drinks anymore!");
		} else {
			thirstLevel = thirstLevel - 10;
			fireLevel = fireLevel - 5;
			System.out.println(nameOfPet + " says thank you, it was starting to feel parched!");
		}
	}

	public void fireRemovalIndividual(String nameOfPet, int hungerLevel, int thirstLevel, int fireLevel) {// Fire
																											// Removal
																											// Individual
		if (fireLevel - 10 <= 0) {
			// makeTheDragon();
			System.out.println(nameOfPet + " has huffed and puffed and blew out all its fire!");
		} else {
			fireLevel = fireLevel - 10;
			hungerLevel = +5;
			thirstLevel = -5;
			System.out.println(nameOfPet + " says thank you for letting it release some of its pent-up fire!");
		}
	}

	public void boredomReduceIndividual(String nameOfPet, int hungerLevel, int thirstLevel, int fireLevel,
			int boredeomLevel) {// Fire Removal Individual
		if (boredeomLevel - 10 <= 0) {
			// makeTheDragon();
			System.out.println(nameOfPet + " is too busy to play with you, sorry!");
		} else {
			boredeomLevel = -10;
			fireLevel = -5;
			hungerLevel = +5;
			thirstLevel = +5;
			System.out.println(nameOfPet + " says thanks for playing with me! I was getting stupid bored.");
		}
	}

	// public void tickEffectForAll() {
	// if (animals.get(animals).getHungerLevel>=0 &&
	// animals.get(animals)getHungerLevel<=55) {
	// animals.get(animals).getHungerLevel()+=4;
	// }
	// if (fireLevel >= 0 && fireLevel <= 55) {
	// fireLevel =+ 4;
	// }
	// if (hungerLevel >= 0 && hungerLevel <= 55) {
	// hungerLevel =+ 4;
	// }
	// if (thirstLevel >= 0 && thirstLevel <= 55) {
	// thirstLevel = thirstLevel + 4;
	// }if (boredomLevel >=0 && boredomLevel<=50) {
	// boredomLevel += 4;
	// } else if (fireLevel > 55 || hungerLevel > 55 || thirstLevel > 55 ||
	// boredomLevel > 55) {
	// int randomEffect = ThreadLocalRandom.current().nextInt(1, 8);
	// fireLevel += randomEffect;
	// hungerLevel =+ randomEffect;
	// thirstLevel =+ randomEffect;
	// boredomLevel =+ randomEffect;
	// }
	// }

	public void tickForAll(String nameOfPet, String hungerLevel, String thirstLevel, String fireLevel,
			String boredeomLevel) {
		VirtualPet animals = findAccount(accountNumber);
		depositToAccount.deposit(amount);
	}

}