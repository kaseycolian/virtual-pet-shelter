import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelterApp = new VirtualPetShelter();

		VirtualPet pet1 = new VirtualPet("Tank", "Centaur");
		VirtualPet pet2 = new VirtualPet("Chairman", "Dragon");
		VirtualPet pet3 = new VirtualPet("Mister", "Griffen");
		VirtualPet pet4 = new VirtualPet("Chubs", "Phoenix");
		VirtualPet pet5 = new VirtualPet("Dozer", "Manticore");

		shelterApp.add(pet1.getNameOfPet(), pet1);
		shelterApp.add(pet2.getNameOfPet(), pet2);
		shelterApp.add(pet3.getNameOfPet(), pet3);
		shelterApp.add(pet4.getNameOfPet(), pet4);
		shelterApp.add(pet5.getNameOfPet(), pet5);

		boolean gameRunning = true;

		System.out.println(
				"Welcome to The Lair!\n\nSometimes creatures become banished from their castle homes and cannot find suitable cave dwellings.");
		System.out.println(
				"\nHere at The Lair we ask that you help take care of your fellow creatures.\nEvery time you interact with our creatures, their needs increase in other areas.\n");

		do {
			shelterApp.tickAll();

			System.out.println("\nHere are the current cave creatures of The Lair and their current condition:\n");
			shelterApp.returnStatusOfAll();
			System.out.println("\n\nSelect an option below:\n");
			System.out.println("Type 1 to feed all of the creatures some tasty little critters.");
			System.out.println("Type 2 to let the creatures drink from The Pool of Elven Tears.");
			System.out.println("Type 3 to release the magic building inside these mighty creatures.");
			System.out.println("Type 4 to take one creature out for a short journey.");
			System.out.println("Type 5 to permanently send a creature to its new castlelands.");
			System.out.println("Type 6 to admit a new creature you have found in need of care.");
			System.out.println("Type 7 to check the status on all creatures at The Lair.");
			System.out.println("Type 8 to quit the game.");
			String optionEntered = input.nextLine();

			switch (optionEntered) {
			case "1":
				shelterApp.feedAll();
				System.out
						.println("Thank you for the delicious critters. We will need the energy for future journeys!");
				break;
			case "2":
				shelterApp.waterAll();
				System.out
						.println("Thank you for taking us.  The Pool of Elven Tears help restore our magical powers.");
				break;
			case "3":
				shelterApp.fireAll();
				System.out.println(
						"Thanks! We are only allowed to release our magic under supervision per The Lair contract.");
				break;
			case "4":
				System.out.println("Please select a pet to take on a mini-journey: " + shelterApp.nameOfPet);
				String nameOfPetToPlay = input.nextLine();
				if (shelterApp.nameOfPet.contains(nameOfPetToPlay)) {
					shelterApp.playWithOne(nameOfPetToPlay);
				} else {
					System.out.println(
							"Oops! " + nameOfPetToPlay + " cannot be found! Pick something else to do at The Lair!");
				}
				break;
			case "5":
				System.out.println("Which creature would you like to send to a far away land?");
				String nameOfPetToAdopt = input.nextLine();
				if (!(shelterApp.nameOfPet.contains(nameOfPetToAdopt))) {
					System.out
							.println("Sorry, that creature must already be out on its journey to its new castleland!");
				} else {
					shelterApp.adopt(nameOfPetToAdopt);
					System.out.println(nameOfPetToAdopt
							+ " is off onto its journey to its new lands! Thank you finding a new castleland for our creature to call home!s");
				}
				break;
			case "6":
				System.out.println("Thank you for finding a creature in need!");
				System.out.println("What is its name?");
				String nameOfNewPet = input.nextLine();
				System.out.println("And what type of creature is " + nameOfNewPet + "?");
				String typeOfNewPet = input.nextLine();
				shelterApp.addYourOwn(nameOfNewPet, typeOfNewPet);
				break;
			case "7":
				shelterApp.returnStatusOfAll();
				break;
			case "8":
				System.out.println("The Lair and all of its creatures say goodbye, friend!");
				System.exit(0);
				break;
			default:
				System.out.println(
						"The Lair does not recognize that request.  Please enter your desired choice once more:");
			}
		} while (gameRunning = true);
	}
}