import java.util.Scanner;
public class NumberSystemConverter {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int number= scn.nextInt();
		String bin = Integer.toBinaryString(number);
		String oct = Integer.toOctalString(number);
		String hex = Integer.toHexString(number);
		System.out.println("b "+bin);
		System.out.println("o "+oct);
		System.out.println("h "+hex);
	}
}
