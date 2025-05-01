package Project3.LMS.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class AssignmentSubmission {
    @Id
    @GeneratedValue
    @Column(name = "submission_id")
    private long id;
}
