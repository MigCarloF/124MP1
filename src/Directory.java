import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Directory {

    public Directory(){
        start();
    }

    private void start(){
        //Displays title
        title();

        //gets number of students
        System.out.println("Input number of students to store: ");
        int noOfStudents = getInt();

        //creates students
        ArrayList<Student> students = createStudents(noOfStudents);

        //displays students
        displayAllStudents(students, noOfStudents);
    }

    private void title(){
        System.out.println("Student Directory Storage\n");
    }

    private Student createStudent(){

        //gets details of student to return
        System.out.println("Creating new student...");
        System.out.println("Input name: ");
        String name = getStr();

        System.out.println("Input age: ");
        int age = getInt();

        System.out.println("Input GPA: ");
        float gpa = getFloat();

        System.out.println("Input grade level: ");
        String gradeLevel = getStr();

        System.out.println();
        System.out.println();
        return new Student(name, age, gpa, gradeLevel);
    }

    private ArrayList<Student> createStudents(int size){
        ArrayList<Student> students = new ArrayList<>();

        for(int i = 0; i < size; i++){
            students.add(createStudent());
        }
        return students;
    }

    private void displayAllStudents(ArrayList<Student> students, int size){
        for(int i = 0; i < size; i++){
            Student stud = students.get(i);
            System.out.println("Student: " + stud.getName());
            System.out.println("Age: " + stud.getAge());
            System.out.println("GPA: " + stud.getGpa());
            System.out.println("Grade Level: " + stud.getGradeLevel());
            System.out.println();
        }
    }

    private int getInt(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    private String getStr(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    private float getFloat(){
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();
        return input;
    }
}
