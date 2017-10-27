package Dz.zada4i621;
//1. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
import java.util.*;
public class zada4a1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double n = 0.0;
	double a = 0.0;
	double x = 0.0;
	System.out.print("ВВЕДИТЕ 3 ЧИСЛА ");
	if (sc.hasNextDouble()) {
		n = sc.nextDouble();
		a = sc.nextDouble();
		x = sc.nextDouble();
	} else {
		System.out.println("WRONT ITEM BROWW!!");
}
if (n<0) {
	n= Math.pow(n,4);
}else {
	n = Math.pow(n, 2);
	
}
if (a<0) {
	a= Math.pow(a,4);
}else {
	a = Math.pow(a, 2);
	
}
if (x<0) {
	x= Math.pow(x,4);
}else {
	x = Math.pow(x, 2);
	
}
System.out.println(n);
System.out.println(a);
System.out.println(x);
}
}