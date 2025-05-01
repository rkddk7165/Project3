package Project3.LMS.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class AssignmentFile {
    @Id
    @Column(name = "assignment_file_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignment_id",nullable = false)
    private Assignment assignment;

    private String file_path;
    private String file_name;
    private String file_type;

    private LocalDateTime updated_time;
}
