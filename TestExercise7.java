import java.util.*;

public class TestExercise7 {
public static void main(String[]args) {
//Variables
int walkTime, prepTime, workStartHour, workStartMinute;
Scanner s = new Scanner(System.in);
 
System.out.printf("Enter Walk Time: ");
walkTime=s.nextInt();
System.out.printf("Enter Preparation Time: ");
prepTime=s.nextInt();
System.out.printf("Enter Work Start Hour: ");
workStartHour=s.nextInt();
System.out.printf("Enter Work Start Minute: ");
workStartMinute=s.nextInt();

Exercise7 n= new Exercise7(walkTime, prepTime, workStartHour, workStartMinute);
n.display();
}
}