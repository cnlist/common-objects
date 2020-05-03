package us.cnlist.objects.responses;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response implements Serializable {
    private ResponseType responseType;
    private ErrorType errorType;
    private String errorMessage;
}
