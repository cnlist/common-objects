package us.cnlist.objects.people;

import us.cnlist.objects.geo.Address;

import java.io.Serializable;
import java.util.Set;

public class Citizen implements Serializable {
    private Long id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String suffix;
    private Set<Address> addresses;
    private boolean employed;
    private String primaryMobilePhone;
    private String primaryEmail;
    private String description;
    private boolean male;


    public Citizen(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public String getPrimaryMobilePhone() {
        return primaryMobilePhone;
    }

    public void setPrimaryMobilePhone(String primaryMobilePhone) {
        this.primaryMobilePhone = primaryMobilePhone;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }
}
