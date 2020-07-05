package org.doublem.vulcanizer.volcano.resource;

import org.doublem.vulcanizer.volcano.model.Volcano;
import org.doublem.vulcanizer.volcano.repository.VolcanoRepository;
import org.doublem.vulcanizer.volcano.service.data.VolcanoParsingService;
import org.doublem.vulcanizer.volcano.service.data.VolcanoRetrievingService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/volcanoes")
public class VolcanoResource {

    @ConfigProperty(name = "volcano_source")
    String volcanoUrl;

    @Inject
    private VolcanoRetrievingService volcanoRetrievingService;

    @Inject
    private VolcanoParsingService volcanoParsingService;

    @Inject
    private VolcanoRepository volcanoRepository;

    @GET
    @Path("/source")
    @Produces(MediaType.TEXT_HTML)
    public String readWholeVolcanoData() {
        return this.volcanoRetrievingService.retrieveVolcanoData();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Volcano> getVolcanoesList() {
        String volcanoData = this.volcanoRetrievingService.retrieveVolcanoData();
        List<Volcano> volcanoes = this.volcanoParsingService.getVolcanoesList(volcanoData);
        this.volcanoRepository.save(volcanoes.get(0));
        System.out.println();
        System.out.println();
        for (int i = 0;i < volcanoes.size(); i++) {
            Volcano vulcan = volcanoes.get(i);
            System.out.println("(" + (i+1) + ", \'" + vulcan.getCountry() + "\', "+ vulcan.getElevation() + ", \'"+vulcan.getLastKnownEruption()+
                    "\', "+vulcan.getLatitude()+", "+vulcan.getLongitude()+", \'"+vulcan.getName()+"\', \'"+vulcan.getNumber()+
                    "\', \'"+vulcan.getRegion()+"\', \'"+vulcan.getStatus()+"\', \'"+vulcan.getType()+"\'),");
        }
        System.out.println();
        System.out.println();
        return volcanoes;
    }

    @GET
    @Path("/first")
    @Produces(MediaType.APPLICATION_JSON)
    public Volcano getFirstVolcano() {
        return this.volcanoRepository.get(0L);
    }
}
