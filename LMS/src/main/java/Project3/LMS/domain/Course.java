package Project3.LMS.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "course_id")
    private Long id;

    private String courseName;
    private int credits;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private Syllabus syllabus;

    @OneToMany(mappedBy = "course")
    private List<Timetable> timetables = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<Assignment> assignments = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<Notice> notices = new ArrayList<>();
}
