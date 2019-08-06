import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		while (!input.equals("END")) {
			System.out.println(isPalindrome(input));
			input = scanner.nextLine();
		}
	}

	private static boolean isPalindrome(String input) {
		int beg = 0;
		int end = input.length()-1;
		char[] data = input.toCharArray();
		
		boolean result = true;
		
		while(beg<=end) {
			if(data[beg]!=data[end]) {
				return false;
			}
			
			beg++;
			end--;
		}
		
		return result;
	}

}
