import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> animals = new HashMap<>();

	// public Map <String, VirtualPet> getAnimals() {
	// return animal;
	// }

	public void add(VirtualPet animal) {
		animals.put(animal.getUserEnteredNameOfPet(), animal);
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

}
