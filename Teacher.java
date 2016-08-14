
/**
 * Write a description of class Teacher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teacher extends Person { 
   
    private static int mySalary;
    private static String mySubject;

    public Teacher(String name, int age, String gender, String subject, int salary) {
        super(name, age, gender);
        //Constructor
        mySalary = salary;
        mySubject = subject;
    }

     public String getSubject()
   {
       return mySubject;
   }

   public double getSalary()
   {
       return mySalary;
   }

   public void setSubject(String subject)
   {
       mySubject = subject;
   }

   public void setSalary(int salary)
   {
       mySalary = salary;
   }
   
    public String toString()
    {

        return super.toString() +", subject: " + mySubject + ", salary: " + mySalary;
    }

}
