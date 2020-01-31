package us.cnlist.objects.geo;

import lombok.Data;

import java.io.Serializable;

@SuppressWarnings("WeakerAccess")
@Data
public class GeoObject implements Serializable {
    private Long id;
    private String name;
    private String regionName;
    private String countryName;

}
