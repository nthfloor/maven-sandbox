package hello;

import org.joda.time.LocalTime;

public class Greeter {
    public String sayHello() {
        return "Hello world!";
    }

    public String tellTheTime() {
        LocalTime currentTime = new LocalTime();
		return "The current local time is: " + currentTime;
    }
}