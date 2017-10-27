package Dz.zada4i613;

//5. Целое число N является четным двузначным числом.
import java.util.*;

public class zada4a5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		System.out.print("ВВЕДИТЕ ЧИСЛО ");

	/*	if (sc.hasNextInt()) {
			N = sc.nextInt();
		}

		if ((N % 2 == 0) && (N / 10 < 10)) {

		} else {

		}

		if (N % 2 == 0) {
			if (N /10 < 10) {
				// ok
			}
			else {
				
			}

		} else {

		}*/

		if (sc.hasNextInt()) {
			N = sc.nextInt();
		} else {
			System.out.println("WRONT ITEM BROWW!!");
		}
			if (N % 2 == 0) {
				N = N / 10;
				System.out.println(N);
			} else {
				System.out.println("WRONT ITEM BROWW!!");
			}
			if (N < 10) {
				System.out.println("true " + N);
			} else {
				System.out.println("false " + N);

			}
		}
	}

