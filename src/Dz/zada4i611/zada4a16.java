package Dz.zada4i611;
import java.util.*;

public class zada4a16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double x;
	double b;
	System.out.print("Введите число: x ");
	if (sc.hasNextDouble()) {
	x = sc.nextDouble();
	System.out.println(x);
	b= Math.abs(Math.pow(x, 2)-Math.pow(x, 3))-((7*x)/(Math.pow(x, 3)-15*x));
	System.out.println("ОТВЕТ = " + b);
	} else {
		System.out.println("Вы ввели не число");
	}
}
}