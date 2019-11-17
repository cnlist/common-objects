package us.cnlist.objects.geo;

import java.io.Serializable;

public class GeoObject implements Serializable {
    private Long id;
    private String name;
    public GeoObject(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
