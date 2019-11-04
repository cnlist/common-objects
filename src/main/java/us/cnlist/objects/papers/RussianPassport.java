package us.cnlist.objects.papers;

import us.cnlist.objects.geo.Address;

public class RussianPassport extends AbstractDocument {

    private Address registrationAddress;
    private String issuerCode;

    public RussianPassport() {
    }

    public Address getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(Address registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getIssuerCode() {
        return issuerCode;
    }

    public void setIssuerCode(String issuerCode) {
        this.issuerCode = issuerCode;
    }
}
