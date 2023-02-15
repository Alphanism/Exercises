import java.util.*;

public class Exercise7
{
//Variables
private int walkTime, prepTime, workStartHour, workStartMinute;

//setters
public Exercise7(int walkTime, int prepTime, int workStartHour, int workStartMinute) 
{
this.walkTime=walkTime;
this.prepTime=prepTime;
this.workStartHour=workStartHour;
this.workStartMinute=workStartMinute;
}
//getters
public double getwalkTime() 
{
return this.walkTime;
} 
public double getprepTime() 
{
return this.prepTime;
}
public double getworkStartHour() 
{
return this.workStartHour;
} 
public double getworkStartMinute() 
{
return this.workStartMinute;
}
//Process
public int workStart()
{
return workStartHour * 60 + workStartMinute;
}
public int leaveTime()
{
return workStart() - (walkTime + prepTime);
}
public int leaveHour()
{
return leaveTime() / 60;
}
public int leaveMinute()
{
return leaveTime() % 60;
}
//output
public void display() 
{
System.out.println("Juan needs to leave his house at " + leaveHour() + ":" + String.format("%02d a.m", leaveMinute()));
}
}