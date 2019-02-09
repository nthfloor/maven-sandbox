package hello.unitTests;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import hello.Greeter;
import org.junit.Test;

public class GreeterTest {

	private Greeter greeter = new Greeter();

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Hello"));
	}

    @Test
	public void greeterTellsTheTime() {
		assertThat(greeter.tellTheTime(), containsString("current local time"));
	}
}