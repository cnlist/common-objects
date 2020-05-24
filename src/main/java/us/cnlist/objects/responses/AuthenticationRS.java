package us.cnlist.objects.responses;

import lombok.Data;
import us.cnlist.objects.people.User;

@Data
public class AuthenticationRS extends Response {
    private User authenticatedUser;
}
