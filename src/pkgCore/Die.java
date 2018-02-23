package pkgCore;

import java.util.Random;

public class Die {
	public static void main(String [] args) {}

	private int DieValue;

	public Die() {
	}
	public int getDieValue() {
		Random rand = new Random();
		this.DieValue = (rand.nextInt(5) + 1);
		return this.DieValue;
	}
}
