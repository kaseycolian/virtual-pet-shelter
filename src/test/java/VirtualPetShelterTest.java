import static java.math.BigDecimal.ZERO;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	private VirtualPet underTest;

	private VirtualPetShelter animal;

	// @Test
	// {
	// VirtualPetShelter underTest = new VirtualPetShelter();
	// VirtualPetShelter underTest = new VirtualPetShelter(nameOfPet, typeOfPet,
	// hungerLevel, thirstLevel, fireLevel, boredomLevel);

	@Test // failed & passed
	public void shouldAddPet() {

		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet animal = new VirtualPet("tank", "");
		underTest.add(animal);
		assertThat(animal.getUserEnteredNameOfPet(), is("tank"));
	}

	@Test //This will not fail after I switched it back to random default values.
	public void shouldFeedIndividualPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet animal = new VirtualPet("", "", 5, 5, 5, 5); // hungerLevel is 1st int value.
		underTest.feedIndividual("tank", 5, 5);
		int hunger = animal.getHungerLevel();
		assertThat(hunger, is(0));
	}

	@Test //This will not fail after I switched it back to random default values.
	public void shouldWaterIndividualPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet animal = new VirtualPet("", "", 5, 5, 5, 5); // thirstLevel is 2nd int value.
		underTest.waterIndividual("tank", 5, 5);
		int thirst = animal.getThirstLevel();
		assertThat(thirst, is(0));
	}

}
