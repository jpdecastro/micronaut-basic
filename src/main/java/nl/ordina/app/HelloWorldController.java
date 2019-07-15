package nl.ordina.app;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloWorldController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        String target = System.getenv("TARGET");
        if (target == null) {
            target = "NOT SPECIFIED";
        }
        return "Hello World: " + target;
    }
}
