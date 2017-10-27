package Dz.zada4i612;
//4. Найти произведение цифр заданного четырехзначного числа.
import java.util.*;

public class zada4a4 {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ВВЕДИТЕ ЧИСЛО");

		int sum = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		} else {
			System.out.println("Вы ввели не число");
		}
		while (n != 0) { // Суммирование цифр числа
			sum = sum + (n % 10);
			n /= 10;
		}
		System.out.println(sum + " ");
	}
}
