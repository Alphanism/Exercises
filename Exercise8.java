public class Exercise8
{
//Variables
private String name;
private double distance;
private int hours, minutes;
int distanceToInt;

//setters
public Exercise8(String name, double distance) 
{
this.name=name;
this.distance=distance;
}
//getters
public String getname() 
{
return this.name;
}
public double getdistance() 
{
return this.distance;
}
//Process
public double Compute()
{
return getdistance() / 2;
}
public int Compute2()
{
return hours = (int) Compute();
}
public int Compute3()
{
return minutes = (int) (( Compute() - hours) * 60);
}
public int Compute4()
{
return distanceToInt = (int) distance;
}
//output
public void display() 
{
System.out.println(getname() +" would take "+ Compute2() +" hour(s) and "+ Compute3() +" minute(s) to run "+ Compute4() +" kilometer(s).");

}
}