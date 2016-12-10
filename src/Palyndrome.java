
public class Palyndrome {
	
	public static void main(String[] args) {
		String word = "anna";
        char[] warray = word.toCharArray(); 
        System.out.println(isPalindrome(warray));    
	}
	
	public static boolean isPalindrome(char[] word) {	    	
		int startIndex = 0;
	    int endIndex = word.length - 1;
	    while (endIndex > startIndex) {
	        if (word[startIndex] != word[endIndex]) {
	            return false;
	        }
	        ++startIndex;
	        --endIndex;
	    }
	    return true;
	}	
}