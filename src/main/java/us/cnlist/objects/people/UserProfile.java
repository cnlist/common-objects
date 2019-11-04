package us.cnlist.objects.people;

import java.io.Serializable;

public class UserProfile implements Serializable {

    private Citizen citizenData;

    public UserProfile() {

    }

    public Citizen getCitizenData() {
        return citizenData;
    }

    public void setCitizenData(Citizen citizenData) {
        this.citizenData = citizenData;
    }
}
