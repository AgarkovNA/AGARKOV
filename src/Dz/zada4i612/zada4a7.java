package Dz.zada4i612;

import java.util.*;
//7. ���� ��� �������������� ����� � � �. ��������� �� �����, ��������, ������������ � �������.
public class zada4a7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		double i;
		double j;
		double c;
		double b;
		System.out.print("������� �����: i � z ");
		if (sc.hasNextDouble()) { // ���������� ������� ���� � ������ ����� ����� ������� �����
			x = sc.nextDouble(); // ��������� ����� � ������ ����� � ��������� � ����������
			y = sc.nextDouble();
			System.out.println(x);
			System.out.println(y);
			c = x - y;
			System.out.println("�������� = " + c);
			b = x + y;
			System.out.println("����� = " + b);
			i = x/y;
			System.out.println("������� = " + i);
			j= x*y;
			System.out.println("������������ = " + j);
		} else {
			System.out.println("�� ����� �� �����");
		}
	}
}