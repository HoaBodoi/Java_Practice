package test;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Chiều dài hình chữ nhật: ");
		int chieudai = scanner.nextInt();
		System.out.printf("Chiều rộng hình chữ nhật: ");
		int chieurong = scanner.nextInt();
		System.out.println("Chu vi hình chữ nhật: " + (chieudai + chieurong) * 2);
		System.out.println("Diện tích hình chữ nhật: " + chieudai * chieurong);
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + Math.min(chieudai, chieurong));
		scanner.close();
	}

}
