package test;

import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Cạnh của hình vuông: ");
		double a = scanner.nextDouble();
		System.out.printf("Thể tích của hình lập phương: " + Math.pow(a, 3));
		scanner.close();
	}
}
