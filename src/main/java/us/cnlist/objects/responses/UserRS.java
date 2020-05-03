package us.cnlist.objects.responses;

import lombok.Data;
import us.cnlist.objects.people.User;

import java.io.Serializable;

@Data
public class UserRS extends Response {

    private User user;

}
