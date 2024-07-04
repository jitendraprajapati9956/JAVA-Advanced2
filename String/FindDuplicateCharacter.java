package JAVA.String;
import java.util.HashSet;

public class FindDuplicateCharacter {

	static char getDuplicate(char[] str) {
		HashSet<Character> h = new HashSet<>();
		for (int i = 0; i < str.length - 1; i++) {
			char c = str[i];
			if (h.contains(c)) {
				return c;
			} else {
				h.add(c);
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		System.out.println("Find Duplicate Character:");
     
		String str = "JITENDRA";
		char[] arr = str.toCharArray();
		System.out.println(getDuplicate(arr));
	}
}
