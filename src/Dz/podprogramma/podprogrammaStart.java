package Dz.podprogramma;
import Dz.podprogramma.*;

import java.util.*;
public class podprogrammaStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("¬¬≈ƒ»“≈ ◊»—À»“≈À‹ Ë «Õ¿Ã≈Õ¿“≈À‹ 1 Ë 2ÓÈ ‰Ó·Ë");
		if (sc.hasNextInt()){
			a = sc.nextInt();
			c = sc.nextInt();
			b = sc.nextInt();
			d = sc.nextInt();
		}else{
			System.out.println("WRONG");
		}
		
		podprogramma11i13 fr1 = new podprogramma11i13(a, c);
		podprogramma11i13 fr2 = new podprogramma11i13(b, d);
		podprogramma11i13 Podprogramma11i13 = new podprogramma11i13();
		fr1.setCh(1);
		fr2.setCh(2);
		podprogramma11i13 fr;
		fr = Podprogramma11i13.Item(fr1, fr2);

		System.out.println(fr.getCh() + "/" + fr.getZh());
	}
}

