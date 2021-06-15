import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private List<Student> students;

    public Cohort(){
        this.students = new ArrayList<>();
    }

        public double getCohortAverage(){
        double avg = 0;
        for(Student student : this.getStudents()){
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
public static void main(String[] args) {
   Cohort next = new Cohort();

    Student student = new Student(1234567, "Jeff");
    student.addGrade(90);
    student.addGrade(95);
    student.addGrade(94);
    System.out.printf("%s's student ID #: %d\n", student.getName(),student.getId());
    System.out.printf("Grades for %s: %s\n",student.getName(),student.getGrades());
    System.out.printf("%s's grade average: %.2f\n", student.getName(), student.getGradeAverage());
    next.addStudent(student);
    System.out.println();
    Student student1 = new Student( 3456789, "Bill");
    student1.addGrade(88);
    student1.addGrade(89);
    student1.addGrade(86);
    System.out.printf("%s's student ID #: %d\n", student1.getName(),student1.getId());
    System.out.printf("Grades for %s: %s\n",student1.getName(),student1.getGrades());
    System.out.printf("%s's grade average: %.2f\n", student1.getName(), student1.getGradeAverage());
    next.addStudent(student1);
    System.out.println();
    Student student2 = new Student(1357986, "Larry");
    student2.addGrade(92);
    student2.addGrade(86);
    student2.addGrade(99);
    System.out.printf("%s's student ID #: %d\n", student2.getName(),student2.getId());
    System.out.printf("Grades for %s: %s\n",student2.getName(),student2.getGrades());
    System.out.printf("%s's grade average: %.2f\n", student2.getName(), student2.getGradeAverage());
    next.addStudent(student2);
    System.out.println();

    System.out.printf("Cohort grade average: %.2f",next.getCohortAverage());
}
}
