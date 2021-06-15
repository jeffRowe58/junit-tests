import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {



    @Test
    public void testCreateStudent(){
        Student fer = new Student(1L, "fer");
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }
    @Test
    public void testStudentFields(){
        Student fer = new Student(1L, "fer");
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(0, fer.getGrades().size());
    }
    @Test
    public void testAddGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }
    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
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
