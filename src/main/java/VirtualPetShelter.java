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
		// add exemption if the key isn't present.
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