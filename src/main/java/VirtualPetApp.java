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
		System.out.println("The fire level for " + pet1 + "" + pet1.getFireLevel());
		System.out.println(pet1.getHungerLevel());
		shelterApp.adopt("Chubs");
		System.out.println(shelterApp.nameOfPet);
		System.out.println(pet1.getFireLevel());
		System.out.println(pet1.getAllLevelsForIndividual());
		// shelterApp.adopt //to remove a pet
		System.out.println(shelterApp.nameOfPet);
		// System.out.println(shelterApp.animals());

		System.out.println(
				"Welcome to The Lair!  Sometimes creatures are banished from castles and cannot find a suitable cave to call home.  \nHere at The Lair we ask that you help take care of your fellow creatures.");
		System.out.println(
				"Don't forget that every time you interact with our pets, they become a little more needy.\nAlso, if you neglect any of their needs for too long, they may die.  Don't kill the creatures.");

	
		do {
			
			System.out.println("Here are the current cave creatures of The Lair and their current condition:");
			shelterApp.returnStatusOfAll();
			System.out.println("\nRemember that if you take care of the needs in one area, conditions of other needs may change.\nSelect an option below:");
			System.out.println("Type 1 to feed all of the creatures some tasty little critters.");
			System.out.println("Type 2 to let the creatures drink from the pool of Elven tears.");
			System.out.println("Type 3 to release the fire igniting inside of the mighty creatures.");
			System.out.println("Type 4 to take one creature out for a short journey.");
			System.out.println("Type 5 to adopt a pet out to its new castle.");
			System.out.println("Type 6 to admit a new creature you have found in need of care.");
			System.out.println("Type 7 to check the status on all creatures.");
			System.out.println("Type 8 to quit the game.");
			String optionEntered = input.nextLine();
			shelterApp.tickAll();

			switch (optionEntered) {
			case "1":
				shelterApp.feedAll();
				break;
			case "2":
				shelterApp.
				break;
			case "3":
				shelterApp.
				break;
			case "4":
			System.out.println("Please select a pet:"+ shelterApp.nameOfPet);
			String nameOfPetToPlay = input.nextLine();
			if (shelterApp.nameOfPet.contains(nameOfPetToPlay)){
				shelterApp.playWithOne(nameOfPetToPlay);
			}System.out.println("That creature does not reside here. Pick another name.");
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				shelterApp.returnStatusOfAll();
				break;
			case "8":
				System.out.println("The Lair and all of its creatures says goodbye, friend!");
				System.exit(0);
				break;
			default:
				System.out.println("The Lair does not recognize that request.  Please enter your desired choice once more:");
	
	
	
	
			
	}
}