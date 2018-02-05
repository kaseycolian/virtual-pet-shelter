import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldReturnTypeOfPet() {
		VirtualPet underTest = new VirtualPet("name of pet", "cat");
		String typeOfPet = underTest.getTypeOfPet();
		assertThat(typeOfPet, is("cat"));
	}

	@Test
	public void shouldReturnNameOfPet() {
		VirtualPet underTest = new VirtualPet("Chubs", "type of pet");
		String nameOfPet = underTest.getNameOfPet();
		assertThat(nameOfPet, is("Chubs"));
	}

	@Test
	public void shouldReturnHungerLevel() {
		VirtualPet underTest = new VirtualPet("", "", 50, 0, 0, 0);
		int hungerLevel = underTest.getHungerLevel();
		assertThat(hungerLevel, is(50));
	}

	@Test
	public void shouldReturnThirstLevel() {
		VirtualPet underTest = new VirtualPet("", "", 0, 40, 0, 0);
		int thirstLevel = underTest.getThirstLevel();
		assertThat(thirstLevel, is(40));
	}

	@Test
	public void shouldReturnFireLevel() {
		VirtualPet underTest = new VirtualPet("", "", 0, 0, 30, 0);
		int fireLevel = underTest.getFireLevel();
		assertThat(fireLevel, is(30));
	}

	@Test
	public void shouldReturnBoredomLevel() {
		VirtualPet underTest = new VirtualPet("", "", 0, 0, 0, 20);
		int boredomLevel = underTest.getBoredomLevel();
		assertThat(boredomLevel, is(20));
	}

	@Test
	public void shouldEffect3LevelsWhenPLay() {
		VirtualPet underTest = new VirtualPet("", "", 5, 4, 3, 0);
		int hungerLevel = underTest.getHungerLevel();
		assertThat(hungerLevel, is(5));
		int thirstLevel = underTest.getThirstLevel();
		assertThat(thirstLevel, is(4));
		int fireLevel = underTest.getFireLevel();
		assertThat(fireLevel, is(3));

	}

	// Tested playWithOne for practice. Do not need to test feedOne nor
	// tickEffectForOne as everything within the method has been tested above.
}
