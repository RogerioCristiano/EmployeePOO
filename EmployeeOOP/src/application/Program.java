package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (Y/N): ");
			char confirma = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (confirma == 'y') {
				System.out.print("AdicionalCharge: ");
				double despesaAdicional = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, despesaAdicional);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}

		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.print(emp.getName() + " - $ " + String.format("%.2f%n", emp.pagamento()));
		}
		
		sc.close();
	}
}