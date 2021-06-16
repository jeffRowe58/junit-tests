import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    private Student stud;

    @Before
    public void setUp(){
        this.stud = new Student (1L, "Student Body");
    }

    @Test
    public void testCreateStudent(){
        Student student = new Student(1L, stud.getName());

        assertEquals(1L, stud.getId());
        assertEquals("Student Body", stud.getName());
    }

    @Test
    public void testGetId(){
        assertEquals(1, stud.getId());
        Student craig = new Student(27, "Craig Gregson");
        assertEquals(27, craig.getId());
    }
    @Test
    public void testGetName(){
        assertEquals("Student Body", stud.getName());
        Student jenn = new Student(33, "Jenn Ann Hologram");
        assertEquals("Jenn Ann Hologram", jenn.getName());
    }
    @Test
    public void testAddGrade(){
        stud.addGrade(78);
        stud.addGrade(84);
        stud.addGrade(99);
        assertEquals(3, stud.getGrades().size());
        stud.addGrade(88);
        assertEquals(4, stud.getGrades().size());
        Student jenn = new Student(33, "Jenn Ann Hologram");
        jenn.addGrade(100);
        assertEquals(1, jenn.getGrades().size());
    }
    @Test
    public void testAverageGrade(){
        stud.addGrade(75);
        stud.addGrade(25);
        stud.addGrade(50);
        assertEquals(50, stud.getGradeAverage(),0);
    }

    public static void main(String[] args) {
        Student student = new Student(1234567, "Jeff");
        student.addGrade(90);
        student.addGrade(95);
        student.addGrade(94);
        System.out.printf("%s's student ID #: %d\n", student.getName(),student.getId());
        System.out.printf("Grades for %s: %s\n",student.getName(),student.getGrades());
        System.out.printf("%s's grade average: %.2f\n", student.getName(), student.getGradeAverage());
        addStudent(student);
        System.out.println();
        Student student1 = new Student( 3456789, "Bill");
        student1.addGrade(88);
        student1.addGrade(89);
        student1.addGrade(86);
        System.out.printf("%s's student ID #: %d\n", student1.getName(),student1.getId());
        System.out.printf("Grades for %s: %s\n",student1.getName(),student1.getGrades());
        System.out.printf("%s's grade average: %.2f\n", student1.getName(), student1.getGradeAverage());
        addStudent(student1);
        System.out.println();
        Student student2 = new Student(1357986, "Larry");
        student2.addGrade(92);
        student2.addGrade(86);
        student2.addGrade(99);
        System.out.printf("%s's student ID #: %d\n", student2.getName(),student2.getId());
        System.out.printf("Grades for %s: %s\n",student2.getName(),student2.getGrades());
        System.out.printf("%s's grade average: %.2f\n", student2.getName(), student2.getGradeAverage());
        addStudent(student2);



    }

    private static void addStudent(Student student) {
    }
}
