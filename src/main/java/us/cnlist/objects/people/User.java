package us.cnlist.objects.people;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "system_user")
public class User implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_user", allocationSize = 1, sequenceName = "seq_sysuser")
    @GeneratedValue(generator = "seq_user")
    private Long id;
    @Column(name = "user_login")
    private String login;
    @Column(name = "user_password")
    private String password;
    private boolean enabled;
    @Column(name = "registration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

}
