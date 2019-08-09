package exercises.school;

//Class Design: In IntelliJ, create a new package school in the java-exercises project.
//        Add the class Student that was discussed in the reading for this class to this new package.
//        Add all getters and setters. Think about the access level each should have,
//        and reduce the access level of at least one setter to less than public.
//        Make sure you can defend your reasoning in words.

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;


    //Student Constructor
    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

//    Exercises for 3.6 Prep
//    In your Student class, update the code with implementations for addGrade and
//    getGradeLevel which were sketched out in Classes and Objects: Encapsulating Behavior.
//    To update the GPA, you'll need to update the quality score.

    public void addGrade(int points, int credits) {

        //    You can compute the existing quality score by calculating gpa * numberOfCredits.
        double totalQualityScore = gpa * numberOfCredits;

        //Then update the quality score and numberOfCredits
        double newQualityScore = totalQualityScore + (points * credits);
        numberOfCredits += credits;

        //compute the new GPA with the new numbers

        gpa = newQualityScore/numberOfCredits;
    }

    //Add custom equals() and toString() methods to the Student class.

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o) {
        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }


    //Getters and Setters for prep 3.5

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    //Make private as studentId should be set once and never changed
    private void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

}
