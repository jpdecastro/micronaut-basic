package nl.ordina.app;

import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;

@Primary
@Singleton
public class GreetingServiceMicronaut implements GreetingService {

    @Override
    public String getGreeting() {
        return "Micronaut salutes you! ";
    }
}
