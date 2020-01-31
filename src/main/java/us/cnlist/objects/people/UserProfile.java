package us.cnlist.objects.people;

import lombok.Data;

import java.io.Serializable;

@SuppressWarnings("WeakerAccess")
@Data
public class UserProfile implements Serializable {
    private Long id;
    private Citizen citizenData;

}
