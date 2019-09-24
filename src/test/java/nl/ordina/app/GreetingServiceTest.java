package nl.ordina.app;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

public class GreetingServiceTest {

    @Test
    public void getGreeting() {
        GreetingService service = new GreetingServiceMicronaut();
        Assert.assertThat(service.getGreeting(), IsEqual.equalTo("Springboot salutes you! "));
    }
}
