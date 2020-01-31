package us.cnlist.objects.papers;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
class AbstractDocument implements Serializable {

    private String serialNumber;
    private String documentNumber;
    private String documentName;
    private boolean primary;
    private Date issueDate;
    private String issuerName;
    private String description;

}
