package Project3.LMS;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Assignment {
    @Id
    @GeneratedValue
    @Column(name = "assignment_id")
    private long id;
}
