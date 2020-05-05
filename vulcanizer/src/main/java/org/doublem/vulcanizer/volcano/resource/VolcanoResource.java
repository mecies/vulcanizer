package org.doublem.vulcanizer.volcano.resource;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/volcanoes")
public class VolcanoResource {

    @ConfigProperty(name = "volcano_source")
    String volcanoUrl;

//    TODO implement volcano data retrieving service
//    TODO implement volcano data parsing service

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String readAllVolcanoes() {
//        TODO: Move this to dedicated service keeping it SOLID boi
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(this.volcanoUrl);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        response.close();
        return value;
    }
}
