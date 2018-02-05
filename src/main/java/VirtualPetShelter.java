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
		this.add(name, userAdded);
	}

	public Collection<VirtualPet> animalsss() {
		Collection<VirtualPet> allPetInfo = animals.values();
		return allPetInfo;
	}

	public void adopt(String nameOfPet) {
		animals.remove(nameOfPet);// add exemption if the key isn't present.
	}

	public void playWithOne(String nameOfpet) {
		VirtualPet petToPlay = animals.get(nameOfpet);
		petToPlay.playWithOne();
		
		System.out.println(petToPlay.getNameOfPet() + " says thanks for playing!");
	}

	public void feedAll() {
		for (VirtualPet petToFeed : animals.values()) {
			petToFeed.feedOne();
			if (petToFeed.getHungerLevel()-10<=0);{
			petToFeed.setHungerLevel(0);
			System.out.println(petToFeed.getNameOfPet() + " cannot fit anymore critters in its belly!");
		}
	}

	public void tickAll() {
		for (VirtualPet petToTickOff : animals.values()) {
			petToTickOff.tickEffectOne();
		}
		
	}
	
	
	 public void returnStatusOfAll() {
		for (VirtualPet petToDisplay : animals.values()) {
	 System.out.println( petToDisplay.getNameOfPet() + " is = Hunger Level: " + petToDisplay.getHungerLevel() + " Thirst Level: " + petToDisplay.getThirstLevel());
	 } 

}
}