package Project3.LMS.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Syllabus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "syllabus_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    private String content;
}
