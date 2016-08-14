
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    protected String myIdNum;    // Student Id Number
    protected double myGPA;      // grade point average

    // constructor
    public Student(String name, int age, String gender,
    String idNum, double gpa)
    {
        // use the super class' constructor
        super(name, age, gender);

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    
    public String getID()
    {
        return myIdNum;
    }

    public double getGPA()
    {
        return myGPA;
    }

    public void setidNum(String idNum) // method
    {
        myIdNum = idNum;
    }

    public void setGPA(double gpa)
    {
        myGPA = gpa;
    }

    public String toString()
    {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
    }
}
 // end class
