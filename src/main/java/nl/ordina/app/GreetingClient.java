package nl.ordina.app;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("/greet")
public interface GreetingClient {

    @Get("/{name}")
    String greet(String name);

}