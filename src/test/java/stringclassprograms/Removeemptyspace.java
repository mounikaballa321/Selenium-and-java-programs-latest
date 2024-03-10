package stringclassprograms;

public class Removeemptyspace {

	public static void main(String[] args) {
		//  Remove White Spaces From Given String
		
		String s=" J a va s ta r ";
		String s1=s.replaceAll("\\s", "");
		// "\\s" means single space which replaces with ""
		System.out.println(s1);

	}

}
