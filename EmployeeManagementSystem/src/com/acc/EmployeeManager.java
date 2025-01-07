package com.acc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.acc.model.Employee;
import com.acc.service.OperableImp1;

public class EmployeeManager {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OperableImp1 object = new OperableImp1();
		Employee emp;
		int ch;
		int e_id,e_age;
		String e_fname,e_lname;
		float e_salary;
		
		do {
			System.out.println("1. Display All Employee Records ");
			System.out.println("2. Find Employee Record");
			System.out.println("3. Add new Employee Record");
			System.out.println("4. Delete Employee Record");
			System.out.println("5. Update Employee Age");
			System.out.println("6. Update Employee Salary");
			System.out.println("7. Delete All Employees Record");
			System.out.println("8. Increase All Employees Salary By %");
			System.out.println("Enter choice >>> ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				List<Employee> ll = new ArrayList<Employee>();
				ll = object.findAll();
				for(Employee employee : ll) {
					System.out.println(employee);
				}
				break;
			case 2:
				System.out.println("Enter Employee id : ");
				e_id = sc.nextInt();
				emp = object.find(e_id);
				System.out.println(emp);
				break;
			case 3:				
				System.out.println("Enter id : ");
				e_id = sc.nextInt();
				System.out.println("Enter Age : ");
				e_age = sc.nextInt();
				System.out.println("Enter First Name : ");
				e_fname = sc.next();
				System.out.println("Enter Last Name : ");
				e_lname = sc.next();
				System.out.println("Enter Salary : ");
				e_salary = sc.nextFloat();
				emp = new Employee(e_id,e_age,e_fname,e_lname,e_salary);
				object.add(emp);
				break;
			case 4: 
				System.out.println("Enter Employee id : ");
				e_id = sc.nextInt();
				object.delete(e_id);
				break;
			case 5:
				System.out.println("Enter id : ");
				e_id = sc.nextInt();
				System.out.println("Enter Age : ");
				e_age = sc.nextInt();
				object.updateAge(e_id, e_age);
				break;
			case 6:
				System.out.println("Enter id : ");
				e_id = sc.nextInt();
				System.out.println("Enter Salary : ");
				e_salary = sc.nextFloat();
				object.updateSalary(e_id, e_salary);
				break;
			case 7:
				object.deleteAll();
				break;
			case 8:
				System.out.println("Enter Per Number to Update salary : ");
				object.increaseSalary(sc.nextFloat());
				break;
			default:
				System.out.println("Invalid choice....");
				
			}
			
			System.out.println("Press 1 to continue... ");
			ch = sc.nextInt();
		}while(ch==1);
		
		System.out.println("Exited!");
		System.out.println("Thank you for using the application.....");
	}

}
