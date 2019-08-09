package exercises.school;
import java.util.ArrayList;

//In the school package, create a class Course with at least three fields.
//        Before diving into IntelliJ, use pen and paper to work through what these might be,
//        including the data types, access levels, and whether it makes sense for any of them to be static or final.
//        At least one of your fields should be an ArrayList or HashMap, and you should use your Student class.



public class Course {

    private String name;
    private String teacher;
    private static int nextCourseId = 1;
    private final int courseId;
    private ArrayList<Student> studentList;

    //Course Constructor
    public Course(String name, String teacher) {
        this.name = name;
        this.teacher= teacher;
        this.courseId = nextCourseId;
        this.studentList = new ArrayList<>();
        nextCourseId++;
    }

    //Add Student to StudentList
    public void addStudent(Student student){
            studentList.add(student);
    }

    //From Prep 3.6: Add custom equals() and toString() methods to the Course class

    public String toString() {

        ArrayList<String> nameList = new ArrayList<>();

        for(Student student: studentList) {
            nameList.add(student.getName());
        }
        return name + " (Teacher: " + teacher + ", Students" + nameList + ")";
    }

    public boolean equals(Object o) {
        Course theCourse = (Course) o;
        return theCourse.getCourseId() == getCourseId();
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String aTeacher) {
        teacher = aTeacher;
    }

    public int getCourseId() {
        return courseId;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> aStudentList) {
        this.studentList = aStudentList;
    }




}
