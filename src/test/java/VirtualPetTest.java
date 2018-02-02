import static java.math.BigDecimal.ZERO;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {

@Test
public void shouldAllowConstructionOfString() {
VirtualPet underTest = new VirtualPet ("", "");
String asString = underTest.toString();
assertEquals("nameOfPet", "typeOfPet");
}

	
	
}
