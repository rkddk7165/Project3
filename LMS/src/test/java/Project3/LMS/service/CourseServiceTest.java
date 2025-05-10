package Project3.LMS.service;

import Project3.LMS.domain.Course;
import Project3.LMS.domain.Professor;
import Project3.LMS.repostiory.CourseRepository;
import Project3.LMS.repostiory.ProfessorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(false)
public class CourseServiceTest {

    @Autowired CourseService courseService;
    @Autowired
    ProfessorRepository professorRepository;


    @Test
    public void registerCourseTest() throws Exception{
        //given
        Professor professor = new Professor();
        professor.setName("강현민");
        professorRepository.save(professor);

        Course course = new Course();
        course.setCourseName("운영체제");
        course.setCredits(3);
        course.setProfessor(professor);

        //when
        Long saveId = courseService.registerCourse(course);

        //then
        assertEquals(saveId, course.getId());
    }

}