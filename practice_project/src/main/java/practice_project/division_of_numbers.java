package practice_project;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class division_of_numbers implements calculations{
	numbers_for_calculation numbers_for_calculation_sumCalculation;
	@Autowired
	public division_of_numbers(numbers_for_calculation numbers_for_calculation_sumCalculation) {
		this.numbers_for_calculation_sumCalculation=numbers_for_calculation_sumCalculation;
	}
	public void ans() {
		var scanner = new Scanner(System.in);
		System.out.print("Enter the number 1: ");
		double num1=scanner.nextDouble();
		System.out.print("Enter the number 2: ");
		double num2=scanner.nextDouble();
		numbers_for_calculation_sumCalculation.setNum1(num1);
		numbers_for_calculation_sumCalculation.setNum2(num2);
		try {
		double sumed= numbers_for_calculation_sumCalculation.getNum1()/numbers_for_calculation_sumCalculation.getNum2();
		System.out.println(sumed);}
		catch (Exception e) {
			System.out.println("Enter number other than 0");
			ans();
		}
		}
	}

