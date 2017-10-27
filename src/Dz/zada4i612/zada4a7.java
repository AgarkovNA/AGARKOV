package Dz.zada4i612;

import java.util.*;
//7. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
public class zada4a7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		double i;
		double j;
		double c;
		double b;
		System.out.print("Введите число: i и z ");
		if (sc.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать число
			x = sc.nextDouble(); // считывает число с потока ввода и сохраняем в переменную
			y = sc.nextDouble();
			System.out.println(x);
			System.out.println(y);
			c = x - y;
			System.out.println("РАЗНОСТЬ = " + c);
			b = x + y;
			System.out.println("СУММА = " + b);
			i = x/y;
			System.out.println("ЧАСТНОЕ = " + i);
			j= x*y;
			System.out.println("ПРОИЗВИДЕНИЕ = " + j);
		} else {
			System.out.println("Вы ввели не число");
		}
	}
}