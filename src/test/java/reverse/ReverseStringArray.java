package reverse;

import java.util.Arrays;

public class ReverseStringArray {

	public static void main(String[] args) {
	
		
		String name = "CareerHack";
		String[] s = name.split("");
		//System.out.println(Arrays.toString(s));
		String temp;
		for(int i=0; i<s.length/2; i++) {
			temp = s[i];
			s[i] = s[s.length-1-i];
			s[s.length-1-i]=temp;
			
		}
				System.out.println(Arrays.toString(s));

	}

}
