package lab2_2;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyTest {
	
	Money pieniadzJeden;
	Money pieniadzDwa;

	@Test
	public void porownajDwaObiektyOTakiejSamejWartosci() {
		
		pieniadzJeden = new Money(12.34, "PLN");
		pieniadzDwa = new Money(12.34, "PLN");
		assertThat(pieniadzJeden, is(equalTo(pieniadzDwa)));
	}
	
	@Test
	public void porownajDwaObiektyORoznejWartosci() {
		
		pieniadzJeden = new Money(12.35, "PLN");
		pieniadzDwa = new Money(12.34, "PLN");
		assertThat(pieniadzJeden, is(not(equalTo(pieniadzDwa))));
	}
	
	@Test
	public void multiplyTest() {
		pieniadzJeden = new Money(9,"PLN");
		pieniadzDwa = new Money(90,"PLN");
		
		assertThat(pieniadzJeden.multiplyBy(10),is(equalTo(pieniadzDwa)));
	}
}
