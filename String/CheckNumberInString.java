package JAVA.String;

public class CheckNumberInString {

	public static void main(String[] args) {
		String str = "Hi I am Jitendra Prajapati.";
		Boolean flag = false;		
		for(int i = 0; i < str.length(); i++) {
			flag = Character.isDigit(str.charAt(i));
			if(flag) {
				System.out.println(str + "\n ==> contains number"); break;
			} 
		}
	}
}
