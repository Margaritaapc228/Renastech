package Assignments;

public class IfElse {
	/*
    4)WAP to print the designation of an employee based on the salary.
    Salary$					Designation
	<1000					     Not an employee
	>=1000 and <=10000			Software Tester
	>10000 and <=25000			Software Developer
	>25000 and <=50000			Project manager
	>50000 and <=100000		    Team Leader
	else					    HR Manager*/

    public static void main(String[] args) {
        int salary = 200000;

        if (salary <1000) System.out.println("Not an employee");
        else if (salary>=1000 && salary<=10000) System.out.println("Software Tester");
        else if (salary>10000 && salary<=25000) System.out.println("Software Developer");
        else if (salary>25000 && salary<=50000) System.out.println("Project manager");
        else if (salary>50000 && salary<=100000) System.out.println("Team Leader");
        else System.out.println("HR Manager");



    }

}
