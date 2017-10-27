package Dz.zada4i611;

import java.util.*;

public class zada4a28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i ;
		double z ;
		double x;
		System.out.print("Введите число: i и z ");
		if (sc.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать число
			i = sc.nextDouble(); // считывает число с потока ввода и сохраняем в переменную
			z = sc.nextDouble();
			System.out.println(i);
			System.out.println(z);
			x = Math.pow(Math.cos(i), 2) * (Math.sin(z / 2));
			System.out.println("ОТВЕТ = " + x);
		} else {
			System.out.println("Вы ввели не число");


		}

	}
}
