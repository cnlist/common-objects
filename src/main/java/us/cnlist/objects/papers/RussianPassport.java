package us.cnlist.objects.papers;

import lombok.Data;
import us.cnlist.objects.geo.Address;

@Data
public class RussianPassport extends AbstractDocument {

    private Address registrationAddress;
    private String issuerCode;

}
