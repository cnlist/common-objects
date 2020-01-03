package us.cnlist.objects.people;

import java.io.Serializable;

public class UserProfile implements Serializable {
    private Long id;
    private Citizen citizenData;

    public UserProfile() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Citizen getCitizenData() {
        return citizenData;
    }

    public void setCitizenData(Citizen citizenData) {
        this.citizenData = citizenData;
    }
}
