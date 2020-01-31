package us.cnlist.objects.messages.rq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import us.cnlist.objects.messages.CommonRq;
import us.cnlist.objects.people.User;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
class UserRegisterRQ extends CommonRq implements Serializable {
    private User user;

}
