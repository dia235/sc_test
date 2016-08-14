
/**
 * Write a description of class CollegeStudent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollegeStudent extends Student
{
    private String myMajor;
    private int myYear; 

    public CollegeStudent( String name, int age, String gender, String idNum,
    double gpa, int Year, String Major) // constructor
    {
        super(name, age, gender, idNum, gpa);
        myMajor = Major;
        myYear = Year; 
    }

    public String getMajor()
    {
        return myMajor;
    }

    public int getYear()
    {
        return myYear;
    }

    public void setMajor(String Major) // method
    {
        myMajor = Major;
    }

    public void setYear(int Year) // method
    {
        myYear = Year;
    }

    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}

