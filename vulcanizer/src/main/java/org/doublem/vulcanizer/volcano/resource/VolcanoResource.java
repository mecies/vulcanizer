package org.doublem.vulcanizer.volcano.resource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.doublem.vulcanizer.volcano.model.Volcano;
import org.doublem.vulcanizer.volcano.service.data.VolcanoParsingService;
import org.doublem.vulcanizer.volcano.service.data.VolcanoRetrievingService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/volcanoes")
public class VolcanoResource {

    @ConfigProperty(name = "volcano_source")
    String volcanoUrl;

    @Inject
    VolcanoRetrievingService volcanoRetrievingService;

    @Inject
    VolcanoParsingService volcanoParsingService;

    @GET
    @Path("/source")
    @Produces(MediaType.TEXT_HTML)
    public String readWholeVolcanoData() {
        return this.volcanoRetrievingService.retrieveVolcanoData();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVolcanoesList(){
        String volcanoData = this.volcanoRetrievingService.retrieveVolcanoData();
        List<Volcano> volcanoes = this.volcanoParsingService.getVolcanoesList(volcanoData);
        Gson gson = new GsonBuilder().create();
        return Response.ok().entity(gson.toJson(volcanoes)).build();
    }
}
