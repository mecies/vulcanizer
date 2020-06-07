package org.doublem.vulcanizer.volcano.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Volcano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
