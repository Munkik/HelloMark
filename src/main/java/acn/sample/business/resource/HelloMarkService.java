package acn.sample.business.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/mark")
@Produces(MediaType.APPLICATION_JSON)
public class HelloMarkService {

    @GET
    @Path("/{message}")
    @Produces(MediaType.APPLICATION_JSON)
    public String retrieveRecords(@QueryParam(value = "message") String message) {

        return message;
    }
}
