package us.cnlist.objects.messages.rs;

import us.cnlist.objects.messages.types.RegistrationErrorType;
import us.cnlist.objects.messages.types.RegistrationResult;
import us.cnlist.objects.people.User;

public class UserRegisterRS {

    private User user;
    private RegistrationResult result;
    private RegistrationErrorType errorType;

    public UserRegisterRS() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RegistrationResult getResult() {
        return result;
    }

    public void setResult(RegistrationResult result) {
        this.result = result;
    }

    public RegistrationErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(RegistrationErrorType errorType) {
        this.errorType = errorType;
    }
}
