package us.cnlist.objects.messages.rq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import us.cnlist.objects.messages.CommonRq;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticateUserRQ extends CommonRq {

    private String username;
    private String password;


}
