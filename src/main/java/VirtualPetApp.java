import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet pet1 = new VirtualPet("Tank", "Centaur");
		VirtualPet pet2 = new VirtualPet("Chairman", "Dragon");
		VirtualPet pet3 = new VirtualPet("Mister", "Griffen");
		VirtualPet pet4 = new VirtualPet("Chubs", "Phoenix");
		VirtualPet pet5 = new VirtualPet("Dozer", "Manticore");
		VirtualPetShelter shelterApp = new VirtualPetShelter();
		
//		System.out.println("What would you like your centaur's name to be?");
//		String centaurName = input.nextLine();
		shelterApp.add(pet1.getNameOfPet(), pet1);
		shelterApp.add(pet2.getNameOfPet(), pet2);
		shelterApp.add(pet3.getNameOfPet(), pet3);
		shelterApp.add(pet4.getNameOfPet(), pet4);
		shelterApp.add(pet5.getNameOfPet(), pet5);

		// System.out.println(shelterApp.toString());
		System.out.println(pet1.getHungerLevel());
		System.out.println(pet1.getFireLevel());
		System.out.println("The current animals are: " + shelterApp.nameOfPet);
		System.out.println(shelterApp);
		System.out.println("The fire level for " + pet1 + ""+ pet1.getFireLevel());
//		shelterApp.feedAll(shelterApp.
		System.out.println(pet1.getHungerLevel());
		shelterApp.adopt("Chubs");
		System.out.println(shelterApp.nameOfPet);
		System.out.println(pet1.getFireLevel());
		System.out.println(pet1.getAllLevelsForIndividual());
	// shelterApp.adopt //to remove a pet
	System.out.println(shelterApp.nameOfPet);
	// System.out.println(shelterApp.animals());
	
	}
	// System.out.println(shelterApp.animals().size());
	// System.out.println(shelterApp.animals().);

}
