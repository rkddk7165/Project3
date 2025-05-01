package Project3.LMS.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Admin {
    @Id
    @GeneratedValue
    @Column(name = "admin_id")
    private Long id;

    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "admin")
    private List<Notice> notices = new ArrayList<>();

}
