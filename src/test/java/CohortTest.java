import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort;
    private Student stud;
    private Student jenn;
    private Student jim;
    private Student billy;

    @Before
    public void setUp(){
        this.cohort = new Cohort();
        this.stud = new Student(1, "Dude");
        this.jenn = new Student(2, "Jenn Ann Hologram");
        this.jim = new Student(7, "Jim Bo");
        this.billy = new Student(54, "Billy Ray");
    }
    @Test
    public void testAddStudent(){
        Cohort cohort = new Cohort();
        cohort.addStudent(jim);
        assertEquals(1, cohort.getStudents().size());
        cohort.addStudent(billy);
        assertEquals(2, cohort.getStudents().size());
    }
    @Test
    public void testGetStudents(){
        Cohort cohort = new Cohort();
        cohort.addStudent(jim);
        cohort.addStudent(billy);


        assertEquals(2, cohort.getStudents().size());
        assertEquals("Billy Ray", cohort.getStudents().get(1).getName());
    }
    @Test
    public void testGetCohortAverage(){
        Cohort cohort = new Cohort();
        stud.addGrade(50);
        stud.addGrade(75);
        stud.addGrade(25);
        cohort.addStudent(stud);
        jenn.addGrade(100);
        jenn.addGrade(100);
        jenn.addGrade(100);
        cohort.addStudent(jenn);

        assertEquals(75, cohort.getCohortAverage(), 0);

    }
}
