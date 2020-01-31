package us.cnlist.objects.messages.rs;

import us.cnlist.objects.people.User;

public class AuthenticateUserRs {

    private boolean authenticated;
    private User user;

    public AuthenticateUserRs() {

    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
