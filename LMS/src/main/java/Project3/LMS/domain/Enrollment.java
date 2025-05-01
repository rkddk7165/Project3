package Project3.LMS.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class Enrollment {
    @Id
    @GeneratedValue
    @Column(name = "enrollment_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private LocalDate enrollmentDate;

    @Enumerated(EnumType.STRING)
    private EnrollmentStatus enrollmentsStatus;
}
