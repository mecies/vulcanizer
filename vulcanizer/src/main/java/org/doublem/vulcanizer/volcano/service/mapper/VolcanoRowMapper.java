package org.doublem.vulcanizer.volcano.service.mapper;

import org.doublem.vulcanizer.volcano.model.Volcano;
import org.jsoup.select.Elements;

public class VolcanoRowMapper {

    public static Volcano mapRow(Elements row){
        Volcano volcano = new Volcano();
        volcano.setNumber(row.get(0).text());
        volcano.setName(row.get(1).text());
        volcano.setCountry(row.get(2).text());
        volcano.setRegion(row.get(3).text());
        String latitude = row.get(4).text();
        if(!latitude.isBlank()){
            volcano.setLatitude(Double.valueOf(latitude));
        }
        String longitude = row.get(5).text();
        if(!longitude.isBlank()){
            volcano.setLongitude(Double.valueOf(longitude));
        }
        String elevation = row.get(6).text();
        if(!elevation.isBlank()){
            volcano.setElevation(Double.valueOf(elevation));
        }
        volcano.setType(row.get(7).text());
        volcano.setStatus(row.get(8).text());
        volcano.setLastKnownEruption(row.get(9).text());
        return volcano;
    }

}
