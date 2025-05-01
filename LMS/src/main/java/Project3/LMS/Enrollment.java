package Project3.LMS;

import jakarta.persistence.*;
import jakarta.websocket.server.ServerEndpoint;
import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;
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
