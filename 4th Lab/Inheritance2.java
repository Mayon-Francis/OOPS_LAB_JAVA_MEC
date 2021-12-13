import java.util.Scanner;

class Employee {
	String name;
	int age;
	int phNum;
	String address;
	int salary;
	Scanner sc;

	Employee(){	
		sc = new Scanner(System.in);
	}
	void printSalary(){
		System.out.print("Salary: " + salary + "\n");
	}
	void getData(){
		System.out.print("Enter Name:");
		name = sc.nextLine();
		System.out.print("Enter Age:");
		age = sc.nextInt();
		System.out.print("Enter Phone Number:");
		phNum = sc.nextInt();

		// Flush Stdin
		if(sc.hasNextLine()){
			sc.nextLine();
		}
		System.out.print("Enter Address:");
		address = sc.nextLine();
		System.out.print("Enter Salary:");
		salary = sc.nextInt();
	}
}

class Officer extends Employee {
	String specialization;
}

class Manager extends Employee {
	String department;
}

public class Inheritance2 {
	public static void main(String args[]) {
		Officer ofc = new Officer();
		Manager mng = new Manager();
		System.out.println("****OFFICER****");
		ofc.getData();
		System.out.println("****MANAGER****");
		mng.getData();

		System.out.print("Officer: ");
		ofc.printSalary();
		System.out.print("Manager: ");
		mng.printSalary();
	}
}
