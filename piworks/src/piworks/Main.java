package piworks;

import java.io.IOException;

public class Main {

	private static Gui g;

	public static void main(String[] args) throws IOException {
		setG(new Gui());
		DataExt d=new DataExt();
		d.setFile("deneme.txt");
		d.yukle();
		MaxSum m=new MaxSum();
		System.out.println(m.maxSum(d.getA()));
		g.setJlResult("Max Sum: "+m.maxSum(d.getA()));
	}

	public static Gui getG() {
		return g;
	}

	public static void setG(Gui g) {
		Main.g = g;
	}

}
