package us.cnlist.objects.responses;

import lombok.Data;

@Data
public class UserRegistrationRS {
    private Long userId;
    private String errorMessage;
    private ResponseType responseType;
    private ErrorType errorType;

}
