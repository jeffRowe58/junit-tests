import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grade;

    public Student(long id, String name){
        this.name = name;
        this.id = id;
        grade = new ArrayList<>();
    }
    // returns the student's id
    public long getId(){
        return this.id;
    }

    //returns student's name
    public String getName(){
        return this.name;
    }

    //adds the given grade to the grades list
    public void addGrade(int grade){
        this.grade.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grade;
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grades : grade) {
            sum = sum + grades;
        }
        return (double)sum / grade.size();
    }
}
