package stringclassprograms;

import java.util.Arrays;

public class Sortcharacters {

	public static void main(String[] args) {
		// Sort String Characters In Alphabetical Order
		
		String s="test";
		char[] chararray=s.toCharArray();
		Arrays.sort(chararray);
		System.out.println(new String(chararray));
		
		String s1="mounika";
		char[] chararray1=s.toCharArray();
		Arrays.sort(chararray1);
		System.out.println(new String(chararray1));
		

	}

}
