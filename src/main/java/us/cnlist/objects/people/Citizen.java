package us.cnlist.objects.people;

import lombok.Data;
import us.cnlist.objects.geo.Address;

import java.io.Serializable;
import java.util.Set;

@Data
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

}
