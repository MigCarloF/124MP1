public class Student {
    private String name;
    private int age;
    private float gpa;
    private String gradeLevel;


    public Student(String name, int age, float gpa, String gradeLevel){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getGpa() {
        return gpa;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

}
