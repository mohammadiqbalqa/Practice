package reverse;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "CareerHack";
		//charAt(0)
		//System.out.println(name.charAt(0));
		String reverse = "";
		for(int i =name.length()-1; i>=0; i--) {
			reverse = reverse+name.charAt(i);
			
		}
		System.out.println(reverse);
		

	}

}
