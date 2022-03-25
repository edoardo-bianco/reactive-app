package demo.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/resource")
@Produces({MediaType.TEXT_PLAIN})
public class MyResource {

    @GET
    public String message(){
        return "Hi Quarkus RestEasy Resource";
    }
    
}
