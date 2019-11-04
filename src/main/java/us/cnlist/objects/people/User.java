package us.cnlist.objects.people;

import java.io.Serializable;

public class User implements Serializable {

    private String login;
    private UserProfile profile;
    public User(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }
}
