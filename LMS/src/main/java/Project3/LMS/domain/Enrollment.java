package Project3.LMS.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * 수강신청 엔티티
 */
@Entity
@Getter @Setter
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id",nullable = false)
    private Course course;

    private LocalDate enrollmentDate;

    @Enumerated(EnumType.STRING)
    private EnrollmentStatus enrollmentsStatus;

    /**
     *     createEnrollment() 함수 구현
     *     양방향 관계인 학생과 과목 List에 자동 연결 구현
     *     student.getEnrollments().add(enrollment);
     *     course.getEnrollments().add(enrollment);
     */

}
