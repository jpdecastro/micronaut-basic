package nl.ordina.app;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;

@Controller("/greet")
public class GreetController {

    @Inject
    private GreetingService greetingService;

    @Get("/{name}")
    public String greet(String name) {
        return greetingService.getGreeting() + name;
    }

    @Post(consumes = MediaType.TEXT_PLAIN, produces = MediaType.APPLICATION_XML)
    public String setGreeting(@Body String name) {
        return greetingService.getGreeting() + name;
    }
}