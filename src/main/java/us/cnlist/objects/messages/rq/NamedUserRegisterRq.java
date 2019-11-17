package us.cnlist.objects.messages.rq;

public class NamedUserRegisterRq extends UserRegisterRQ {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
