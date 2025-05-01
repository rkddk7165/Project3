package Project3.LMS.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class AssignmentFile {
    @Id
    @GeneratedValue
    @Column(name = "assignment_file_id")
    private long id;
}
