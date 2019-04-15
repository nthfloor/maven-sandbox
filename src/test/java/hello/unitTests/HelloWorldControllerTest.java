package hello.unitTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import hello.HelloWorldController;
import static org.junit.Assert.assertEquals;vi

@RunWith(SpringRunner.class)
public class HelloWorldControllerTest {

    @Test
    public void getHello() throws Exception {
        HelloWorldController helloController = new HelloWorldController();
        String result = helloController.index();
        assertEquals(result, "Greetings from Spring Boot!");
    }
}