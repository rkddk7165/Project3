package Project3.LMS.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Notice {
    @Id
    @Column(name = "notice_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id")
    private Admin admin;

    /**
     * 필독 : 공지사항 작성자 타입을 정확히 명시 (교수 or 관리자)
     */
    @Enumerated(EnumType.STRING)
    private NoticeWriterType writerType;

    private String title;
    private String content;

    private LocalDateTime date;
}
