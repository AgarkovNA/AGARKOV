package Dz.zada4i611;

import java.util.*;

public class zada4a28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i ;
		double z ;
		double x;
		System.out.print("������� �����: i � z ");
		if (sc.hasNextDouble()) { // ���������� ������� ���� � ������ ����� ����� ������� �����
			i = sc.nextDouble(); // ��������� ����� � ������ ����� � ��������� � ����������
			z = sc.nextDouble();
			System.out.println(i);
			System.out.println(z);
			x = Math.pow(Math.cos(i), 2) * (Math.sin(z / 2));
			System.out.println("����� = " + x);
		} else {
			System.out.println("�� ����� �� �����");


		}

	}
}
