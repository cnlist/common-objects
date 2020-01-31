package us.cnlist.objects.messages.rq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import us.cnlist.objects.contacts.Contact;
import us.cnlist.objects.people.Citizen;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactToCitizenRq {

    private Citizen citizen;
    private Contact contact;

}
