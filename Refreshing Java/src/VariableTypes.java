import java.sql.SQLOutput;
import java.util.Scanner;

public class VariableTypes {
    public static void main(String[] args){
        int age = 15;
        double gpa = 3.5;
        char firstInit = 'K';
        char lastInit = 'H';
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Kayla";
        String studentLastName = "Harvey";
        String studentFullName;

        //Strings are arrays and can be combined
        System.out.println(studentFirstName.charAt(0));
        System.out.println(studentLastName.charAt(0));
        studentFullName = studentFirstName + " " + studentLastName;

        System.out.println(age);
        System.out.println(gpa);
        System.out.println(firstInit);
        System.out.println(lastInit);
        if(hasPerfectAttendance)
        {
            System.out.println(studentFullName + " has perfect attendance");
        }

        //Unclean data entry, should throw error if user enters a non double
        System.out.println("Enter GPA");
        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        System.out.println("GPA is now: " + gpa);
    }
}
