public class Palindrome {

	public static void main(String[] args) {
		
		//level or Level
		String pal_org = "Levels";
		String pal = pal_org.toLowerCase();
		
		int startPosition = 0;
		int endPosition = pal.length() - 1;
		
		boolean isPal = true;
		
		while(startPosition < endPosition) {
			
			String startLetter = pal.substring(startPosition, startPosition+1);
			String endLetter = pal.substring(endPosition, endPosition+1);
			
			if(startLetter.contentEquals(endLetter)==false) {
				isPal = false;
				break;
			}
			
			startPosition++;
			endPosition--;
		}
		
		if(isPal==true) {
			System.out.println("Using substring -- This word is a palindrome: " + pal_org);
		} else {
			System.out.println(pal_org + " Is not a palindrome -- using substring");
		}
		
		String aba = "aba";
		
		int startPos = 0;
		int endPos = aba.length() - 1;
		boolean isPalindrome = true;
		
		while (startPos < endPos) {
			char startLetter = aba.charAt(startPos);
			char endLetter = aba.charAt(endPos);
			
			if(startLetter != endLetter) {
				isPalindrome = false;
				break;
			}
			
			startPos++;
			endPos--;
		}
		
		if(isPalindrome) {
			System.out.println(aba + " is a palindrome");
		} else {
			System.out.println(aba + " is not a palindrome");
		}	

	}

}
