package Dz.zada4i621;

//16. ��������� ���������, ������������ ��������� ������� �� ������� � �������� �����, ���� �� �������� ������ ���������� ��������� �.
import java.util.*;

public class zada4a16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����?");
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		} else {
			System.out.println("WRONT ITEM BROWW!!");
		}
		if (n % 2 == 0) {
			System.out.println("����� ���� �� �����");

		} else {
			System.out.println("����� � �����");
		}
	}
}