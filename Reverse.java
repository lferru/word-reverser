// Word Reverser
// Luis Ferrufino
// 10/17/16
// Reverse.java

public class Reverse {

	public static void main(String[] args) {

		char[] result = args[0].toCharArray();

		for ( int i = 0; i < result.length / 2; i++ ) {

			char temp = result[i];
			result[i] = result[result.length - i - 1];
			result[result.length - i - 1] = temp;
		}
		System.out.println(new String(result));
	}
}
