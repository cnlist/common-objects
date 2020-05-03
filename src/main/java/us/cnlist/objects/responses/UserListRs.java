package us.cnlist.objects.responses;

import lombok.Data;
import us.cnlist.objects.people.User;

import java.util.List;

@Data
public class UserListRs extends Response {
    private List<User> users;
}
