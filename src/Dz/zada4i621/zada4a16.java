package Dz.zada4i621;

//16. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п.
import java.util.*;

public class zada4a16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ЧИСЛО?");
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		} else {
			System.out.println("WRONT ITEM BROWW!!");
		}
		if (n % 2 == 0) {
			System.out.println("никто тебя не любит");

		} else {
			System.out.println("может и любит");
		}
	}
}