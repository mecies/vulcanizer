package org.doublem.vulcanizer.volcano.model;

import lombok.Data;

@Data
public class Volcano {
    private String number;
    private String name;
    private String country;
    private String region;
    private double latitude;
    private double longitude;
    private double elevation;
    private String type;
    private String status;
    private String lastKnownEruption;
}
