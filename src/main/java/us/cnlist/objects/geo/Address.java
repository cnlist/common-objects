package us.cnlist.objects.geo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Address implements Serializable {
    private GeoObject city;
    private GeoObject country;
    private GeoObject province;
    private String houseNumber;
    private String postBox;
    private String apartment;
    private String street;
    private String zipCode;

    private boolean primary;
    private boolean shipping;

}
