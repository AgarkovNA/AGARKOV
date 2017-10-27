package Dz.zada4i621;

//15. ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31, мес€ц Ч от 1 до 12). ≈сли введены некорректные данные, то сообщить об этом.
import java.util.*;

public class zada4ai15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("введите дату и мес€ц");
		int n = 0;
		int a = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
			a = sc.nextInt();
		} else {
			System.out.println("¬¬≈ƒ≈Ќќ Ќ≈ „»—Ћќ");
		}
		if ((n > 31) || (a > 12)) {
			System.out.println("неверна€ дата");
		} else {
			System.out.println(n + "." + a);
		}
	}
}