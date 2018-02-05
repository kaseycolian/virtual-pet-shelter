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

	@Test // This explicity tests add new pet name & type by user, but implicitly tests
			// adding pet.
	public void shouldAddPet() {
		VirtualPet underTest = new VirtualPet("Tank", "Cat");
		String nameOfPet = underTest.getNameOfPet();
		String typeOfPet = underTest.getTypeOfPet();
		assertThat(nameOfPet, is("Tank"));
		assertThat(typeOfPet, is("Cat"));
	}

	@Test
	public void shouldFeedAll() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet shelterApp = new VirtualPet("", "", 5, 0, 0, 0); // hungerLevel is 1st int value.
		underTest.feedAll();
		int hungerLevel = shelterApp.getHungerLevel();
		assertThat(hungerLevel, is(5));
	}

	@Test
	public void shouldWaterAll() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet shelterApp = new VirtualPet("", "", 0, 15, 0, 0);
		underTest.waterAll();
		int thirstLevel = shelterApp.getThirstLevel();
		assertThat(thirstLevel, is(15));
	}

	@Test
	public void shouldFireAll() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet shelterApp = new VirtualPet("", "", 0, 0, 11, 0);
		underTest.fireAll();
		int fireLevel = shelterApp.getFireLevel();
		assertThat(fireLevel, is(11));
	}

	@Test // I think this implicitly tests for the hunger, thirst, fire, and boredom
			// levels. But for practice and certainty, I did those fist and did not refactor
			// in case they are necessary to show.
	public void shouldTickAll() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet shelterApp = new VirtualPet("", "", 1, 2, 3, 4);
		underTest.tickAll();
		int hungerLevel = shelterApp.getHungerLevel();
		assertThat(hungerLevel, is(1));
		int thirstLevel = shelterApp.getThirstLevel();
		assertThat(thirstLevel, is(2));
		int fireLevel = shelterApp.getFireLevel();
		assertThat(fireLevel, is(3));
		int boredomLevel = shelterApp.getBoredomLevel();
		assertThat(boredomLevel, is(4));
	}

	@Test // LOOK AT AGAIN
	public void shouldPlayWithOne() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet shelterApp = new VirtualPet("tank", "", 0, 0, 0, 44);
		String nameOfPet = shelterApp.getNameOfPet();
		underTest.playWithOne(nameOfPet);
		int boredomLevel = shelterApp.getBoredomLevel();
		assertThat(boredomLevel, is(3));
		assertThat(nameOfPet, is("tank"));
	}

	@Test // Need to figure out how to make this test fail properly.
	public void shouldRemoveCreature() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet shelterApp = new VirtualPet("Tank", "");
		String nameOfPet = shelterApp.getNameOfPet();
		underTest.adopt("Tank");
		assertTrue(nameOfPet.contains("Tank"));

	}
}
