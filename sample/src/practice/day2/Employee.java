package practice.day2;

public class Employee {
	long empID = 428090;
	double empSalary = 23892;
	int workingDays = 28;
	float empTax = 9.5f;

	void calculatePf() {
		float pfRate = 10.5f;
		System.out.println("The pf rate of employee is " + pfRate);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Employee id of the employee is " + emp.empID);
		System.out.println("Employee salary is " + emp.empSalary);
		System.out.println("Employee working days is " + emp.workingDays);
		System.out.println("Employee tax is " + emp.empTax);
		emp.calculatePf();
	}
}
