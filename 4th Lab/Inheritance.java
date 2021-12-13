class Employee {
	void display(){
		System.out.println("This is employee class");
	}

	void calcSalary() {
		System.out.println("Salary of Employee is 10000");
	}
}

class Engineer extends Employee{
	@Override
	void calcSalary() {
		System.out.println("Salary of Engineer is 20000");
	}
}

public class Inheritance {

	public static void main(String args[]){
		Engineer obj = new Engineer();
		obj.display();
		obj.calcSalary();

	}
}


