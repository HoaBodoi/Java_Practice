package test;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Your name is:");
		String name = scanner.nextLine();
		System.out.printf("Avgerage results: ");
		int mark = scanner.nextInt();
		System.out.println("Name:" + name);
		System.out.println("Average results:" + mark);
		scanner.close();
	}
}
