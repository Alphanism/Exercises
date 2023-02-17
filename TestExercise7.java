import java.util.*;

public class TestExercise7 {
public static void main(String[]args) {
//Variables
String name;
int ToWalk, ToPrep;
double Hours, Minutes;
Scanner s = new Scanner(System.in);

System.out.printf("Enter name: ");
name=s.nextLine();
System.out.printf("Time to walk to the NSA Quadrangle: ");
ToWalk=s.nextInt();
System.out.printf("Time to Prepare to Work: ");
ToPrep=s.nextInt();
System.out.printf("Staring time of Work in Hour/s: ");
Hours=s.nextInt();
System.out.printf("Staring time of Work in Minutes/s: ");
Minutes=s.nextInt();

Exercise7 n= new Exercise7(name, ToWalk, ToPrep, Hours, Minutes);
n.display();
}
}