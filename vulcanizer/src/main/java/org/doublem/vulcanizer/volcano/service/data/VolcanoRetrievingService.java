package org.doublem.vulcanizer.volcano.service.data;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class VolcanoRetrievingService {

    @ConfigProperty(name = "volcano_source")
    String volcanoUrl;

    public String retrieveVolcanoData() {
        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(this.volcanoUrl);
        Response response = target.request().get();
        String value = response.readEntity(String.class);
        response.close();
        return value;
    }

}
