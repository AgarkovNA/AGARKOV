package Dz.zada4i612;
//4. ����� ������������ ���� ��������� ��������������� �����.
import java.util.*;

public class zada4a4 {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����");

		int sum = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		} else {
			System.out.println("�� ����� �� �����");
		}
		while (n != 0) { // ������������ ���� �����
			sum = sum + (n % 10);
			n /= 10;
		}
		System.out.println(sum + " ");
	}
}
