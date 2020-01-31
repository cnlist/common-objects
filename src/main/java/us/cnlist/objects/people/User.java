package us.cnlist.objects.people;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String login;
    private String password;
    private UserProfile profile;

}
