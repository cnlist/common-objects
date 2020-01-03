package us.cnlist.objects.contacts;

public class Contact {

    private Long id;
    private ContactType contactType;
    private String value;

    public Contact(){

    }

    public Contact(ContactType type, String value){
        this.contactType = type;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
