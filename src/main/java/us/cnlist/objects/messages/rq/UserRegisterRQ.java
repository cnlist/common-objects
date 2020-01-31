package us.cnlist.objects.messages.rq;

import us.cnlist.objects.messages.CommonRq;
import us.cnlist.objects.people.User;

import java.io.Serializable;

public class UserRegisterRQ extends CommonRq implements Serializable {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
