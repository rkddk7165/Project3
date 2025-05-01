package Project3.LMS.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "professor_id")
    private Long id;

    private String name;
    private String email;
    private String department;
    private String password;
    private String phone_number;

    @OneToMany(mappedBy = "professor")
    private List<Notice> notices = new ArrayList<>();

    @OneToMany(mappedBy = "professor")
    private List<Assignment> assignments = new ArrayList<>();

    @OneToMany(mappedBy = "professor")
    private List<Course> courses = new ArrayList<>();
}
