package Dz.zada4i621;

//15. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.
import java.util.*;

public class zada4ai15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���� � �����");
		int n = 0;
		int a = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
			a = sc.nextInt();
		} else {
			System.out.println("������� �� �����");
		}
		if ((n > 31) || (a > 12)) {
			System.out.println("�������� ����");
		} else {
			System.out.println(n + "." + a);
		}
	}
}