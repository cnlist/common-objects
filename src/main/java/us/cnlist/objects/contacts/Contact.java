package us.cnlist.objects.contacts;

import lombok.Data;

@Data
public class Contact {

    private Long id;
    private ContactType contactType;
    private String value;

    public Contact() {

    }

    public Contact(ContactType type, String value) {
        this.contactType = type;
        this.value = value;
    }

}
