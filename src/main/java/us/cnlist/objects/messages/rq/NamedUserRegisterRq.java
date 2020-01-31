package us.cnlist.objects.messages.rq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NamedUserRegisterRq extends UserRegisterRQ {
    private String name;

}
