package dp;
import java.text.DecimalFormat;

public class SingletonTestex {

	public static void main(String[] args) {

		Renbanex a = Renbanex.getInstance();
		Renbanex b = Renbanex.getInstance();

		System.out.println(a.getNumber());
		System.out.println(b.getNumber());
		System.out.println(b.getNumber());
		System.out.println(a.getNumber());

	}

}

class Renbanex{
	private static Renbanex Renbanex = new Renbanex();
	private int number,x;
	private char A[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	DecimalFormat format = new DecimalFormat("000");

	private Renbanex() {
		number = 0;
		x = 0;
	}

	public static Renbanex getInstance() {
		return Renbanex;
	}

	public String getNumber() {
		if(number >= 1000) {
			x = x + 1;
			number = 0;
			return format.format(number);
		}
		number = number + 1;
		return A[x] + format.format(number);
	}

}
