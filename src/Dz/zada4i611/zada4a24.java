package Dz.zada4i611;

import java.util.*;

public class zada4a24 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double x;
	double b;
	System.out.print("Введите число: x ");
	if (sc.hasNextDouble()) {
	x = sc.nextDouble();
	System.out.println(x);
	b= x - 10*Math.sin(x)+Math.abs(Math.pow(x, 4)-Math.pow(x, 5));
	System.out.println("ОТВЕТ = " + b);
	} else {
		System.out.println("Вы ввели не число");
	}
}
}