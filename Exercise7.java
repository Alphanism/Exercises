public class Exercise7
{
//Variables
private String name;
private int ToWalk, ToPrep;
private double Hours, Minutes;

//setters
public Exercise7(String name, int ToWalk, int ToPrep, double Hours, double Minutes) 
{
this.name=name;
this.ToWalk=ToWalk;
this.ToPrep=ToPrep;
this.Hours=Hours;
this.Minutes=Minutes;
}
//getters
public String getname() 
{
return this.name;
}
public int getToWalk() 
{
return this.ToWalk;
}
public int getToPrep() 
{
return this.ToPrep;
}
public double getHours() 
{
return this.Hours;
}
public double getMinutes() 
{
return this.Minutes;
}

//Process
//HOURS
public double MultforHours()
{
return Hours * 60;
}
public double MultforHours2()
{
return MultforHours() - (getToWalk() + getToPrep());
}
public double MultforHours3()
{
return MultforHours2() / 60;
}
public int MultforHours4()
{
return (int) MultforHours3();
}

//MINUTES
public double MultforMinutes()
{
return MultforHours3() - MultforHours4() ;
}
public double MultforMinutes1()
{
return MultforMinutes() * 60;
}
public int MultforMinutes2()
{
return (int) MultforMinutes1();
}
//output
public void display() 
{
System.out.print(getname() +" should leave his house at "+ MultforHours4() +":"+ MultforMinutes2() +" a.m to get to his job.");
}
}