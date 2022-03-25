package demo.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/welcome")
@Produces({MediaType.TEXT_PLAIN})
public class WelcomeResource {
    @GET
    public String welcomeMessage(){
        return "Welcome to Quarkus!";
    }
}
