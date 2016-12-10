public class Palyndrome2 {
	public static void main(String[] args) {
		String word = "pyLyp";
		String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.println(word.compareToIgnoreCase(reversedWord) == 0);
	}
}