import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPetShelter {

	private Map<String, VirtualPet> animals = new HashMap<String, VirtualPet>();
	public Set<String> nameOfPet = animals.keySet();

	public void add(String key, VirtualPet pet) {
		animals.put(key, pet);
	}

	public void addYourOwn(String name, String type) {
		VirtualPet userAdded = new VirtualPet(name, type);
		if (animals.containsKey(name)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate names!  Please create a name that's not yet taken.");
		} else {
			this.add(name, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}
	}

	public Collection<VirtualPet> animalsss() {
		Collection<VirtualPet> allPetInfo = animals.values();
		return allPetInfo;
	}

	public void feedAll() {
		for (VirtualPet petToFeed : animals.values()) {
			petToFeed.feedOne();
		}
	}

	public void waterAll() {
		for (VirtualPet petToWater : animals.values()) {
			petToWater.waterOne();
		}
	}

	public void fireAll() {
		for (VirtualPet petToFire : animals.values()) {
			petToFire.fireOne();
		}
	}

	public void playWithOne(String nameOfpet) {
		VirtualPet petToPlay = animals.get(nameOfpet);
		petToPlay.playWithOne();
		System.out.println(petToPlay.getNameOfPet() + " says thanks for playing!");
	}

	public void tickAll() {
		for (VirtualPet petToTickOff : animals.values()) {
			petToTickOff.tickEffectOne();
		}
	}

	public void adopt(String nameOfPet) {
		animals.remove(nameOfPet);
	}

	public void killPet() {
		for (VirtualPet checkToKill : animals.values()) {
			checkToKill.getHungerLevel();
			checkToKill.getThirstLevel();
			checkToKill.getFireLevel();
			checkToKill.getBoredomLevel();
			if (checkToKill.getFireLevel() >= 100) {
				animals.remove(checkToKill.getNameOfPet());
				System.out.println("You have killed " + checkToKill.getNameOfPet()
						+ " by letting it become consumed by magic! Take better care of The Lair!");
			}
			if (checkToKill.getThirstLevel() >= 100) {
				animals.remove(checkToKill.getNameOfPet());
				System.out.println(
						"You have let " + checkToKill.getNameOfPet() + " die of thirst! Be a better Lair caretaker!");
			}
			if (checkToKill.getHungerLevel() >= 100) {
				animals.remove(checkToKill.getNameOfPet());
				System.out.println(checkToKill.getNameOfPet()
						+ " has died because you let it starve to death. Do a better job at The Lair.");
			}
			if (checkToKill.getBoredomLevel() >= 100) {
				animals.remove(checkToKill.getNameOfPet());
				System.out.println(checkToKill.getNameOfPet()
						+ " was literally bored to death.  Don't forget to take your pets on journeys!");

			}
			if (animals.isEmpty()) {
				System.out.println(
						"You have killed all of the creatures at The Lair.  You have been banished.  Goodbye.");
				System.exit(0);

			} else {
			}
		}
	}

	public void returnStatusOfAll() {
		for (VirtualPet petToDisplay : animals.values()) {
			System.out.println(petToDisplay.getNameOfPet() + " the " + petToDisplay.getTypeOfPet()
					+ " = \n\tHunger Level: " + petToDisplay.getHungerLevel() + " | Thirst Level: "
					+ petToDisplay.getThirstLevel() + "\n\tFireLevel: " + petToDisplay.getFireLevel()
					+ "    | Boredom Level: " + petToDisplay.getBoredomLevel());
		}
	}
}