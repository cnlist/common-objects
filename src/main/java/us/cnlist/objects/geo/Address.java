package us.cnlist.objects.geo;

import java.io.Serializable;

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

    public Address(){

    }

    public GeoObject getCity() {
        return city;
    }

    public void setCity(GeoObject city) {
        this.city = city;
    }

    public GeoObject getCountry() {
        return country;
    }

    public void setCountry(GeoObject country) {
        this.country = country;
    }

    public GeoObject getProvince() {
        return province;
    }

    public void setProvince(GeoObject province) {
        this.province = province;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostBox() {
        return postBox;
    }

    public void setPostBox(String postBox) {
        this.postBox = postBox;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setShipping(boolean shipping) {
        this.shipping = shipping;
    }

    public boolean isShipping() {
        return shipping;
    }
}
