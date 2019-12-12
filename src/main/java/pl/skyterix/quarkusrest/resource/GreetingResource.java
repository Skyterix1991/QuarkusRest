package pl.skyterix.quarkusrest.resource;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import pl.skyterix.quarkusrest.service.NameService;

@Path("/name")
public class GreetingResource {

    @Inject
    NameService nameService;

    @GET
    @Path("/random")
    public String generateRandomName() {
        return nameService.generateRandomName();
    }

}