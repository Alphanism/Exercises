import java.util.*;

public class TestExercise8 {
public static void main(String[]args) { 

//Variables
String name;
double distance;
Scanner s = new Scanner(System.in);

//User Input
System.out.print("Enter name: ");
name=s.nextLine();
System.out.print("Enter distance: ");
distance=s.nextDouble();

//Dispay Input
Exercise8 n= new Exercise8(name, distance);
n.display();
}
}