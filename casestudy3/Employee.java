package casestudy3;
import java.util.*;
public class Employee {
	private static double calculateNetSalary(double basicSalary, int tax) {
		double specialAllowance;
		double hra;
		double transportAllowance;
		if(basicSalary<=10000) {
			hra=0.2*basicSalary;
			specialAllowance=0.8*basicSalary;
			transportAllowance=0.2*basicSalary;
			return (basicSalary+hra+specialAllowance+transportAllowance)-tax;
		}else if(basicSalary>=10001 && basicSalary<=20000) {
			hra=0.25*basicSalary;
			specialAllowance=0.9*basicSalary;
			transportAllowance=0.2*basicSalary;
			return (basicSalary+hra+specialAllowance+transportAllowance)-tax;
		}else {
			hra=0.3*basicSalary;
			specialAllowance=0.95*basicSalary;
			transportAllowance=0.2*basicSalary;
			return (basicSalary+hra+specialAllowance+transportAllowance)-tax;
		}
	}
	public static void main(String[] args) {
		int employeeId;
		String employeeName;
		double basicSalary;
		int tax=2500;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		employeeId=sc.nextInt();
		System.out.println("------------------------------");
		System.out.println("Enter Employee Name");
		employeeName=sc.next();
		System.out.println("------------------------------");
		System.out.println("Enter Basic Salary");
		basicSalary=sc.nextDouble();
		System.out.println("------------------------------");
		double netSal=calculateNetSalary(basicSalary,tax);
		System.out.println("Employee Id: "+employeeId+
				"\nEmployee Name: "+employeeName+
				"\nEmployee Basic Salary: "+basicSalary+
				"\nEmployee Net Salary: "+netSal);
		sc.close();
	}
}
