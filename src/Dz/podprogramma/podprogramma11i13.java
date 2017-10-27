package Dz.podprogramma;
//Даны две дроби (А, В, С, D — натуральные числа). Составить программу для умножения/деления дроби на дробь. Результат должен быть несократимой дробью.
public class podprogramma11i13 {
	private int ch;
	private int zh;
	
	public podprogramma11i13() {
		ch = 0;
		zh = 1;

	}

	public podprogramma11i13(int _ch, int _rn) {
		ch = _ch;
		zh = _rn;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getZh() {
		return zh;
	}

	public void setZh(int zh) {
		this.zh = zh;
	}

	}
	


