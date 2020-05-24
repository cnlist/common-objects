package us.cnlist.objects.requests;

import lombok.Data;

@Data
public class AuthenticationRQ {

    private String email;
    private String password;

}
