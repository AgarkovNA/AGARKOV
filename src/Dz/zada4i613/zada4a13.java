package Dz.zada4i613;

import java.util.Scanner;

//Данные числа х, у являются координатами точки, лежащей в первой координатной четверти.
public class zada4a13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		System.out.println("ВВЕДИТЕ ЧИСЛА x и y");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
			y = sc.nextDouble();
		} else {
			System.out.println("WRONT ITEM BROWW!!!!");
		}
			if (x > 0){
				if (y > 0) {
				System.out.println("true ");
			} else 
				System.out.println("false");
			}
		}
	}

