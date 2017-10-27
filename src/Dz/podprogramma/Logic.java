package Dz.podprogramma;
import Dz.podprogramma.*;

public class Logic {
	public podprogramma11i13 Item(podprogramma11i13 fr1, podprogramma11i13 fr2) {
		int newCh;
		int newZn;
		newCh = fr1.getCh() * fr2.getZh();
		newZn = fr1.getZh() * fr2.getCh();
		podprogramma11i13 fraction = new podprogramma11i13();
		fraction.setCh(newCh);
		fraction.setZh(newZn);
		return fraction;
}
}