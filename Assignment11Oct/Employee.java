package AssignmentClassAndObject;

import java.util.Scanner;

public class Employee
{
	public static void main(String[] args) {
		
		Emp e= new Emp(1015153,"Vinod",15000);
		e.netSalary();
	}
}

class Emp{
	

	int enumber;
	String ename;
	int Basic;
	int DA;
	int IT;
	int netSalary;
	int GS;

	
	
	public Emp(int enumber, String ename, int basic) {
		super();
		this.enumber = enumber;
		this.ename = ename;
		Basic = basic;
	}
		public void netSalary()
	{
	 System.out.println("Employee Number - "+enumber); 
    System.out.println("Employee Name - "+ename);
    DA=((75*Basic)/100);
    System.out.println("Da in salary -"+DA);
    GS=Basic+DA;
    System.out.println("GrossSalary of Emp -"+GS);
    IT=((10*GS)/100);
    System.out.println("IT = "+IT);
    netSalary=GS-IT;
    System.out.println("net Salary of Employee -"+netSalary);
	}
	
	
}
