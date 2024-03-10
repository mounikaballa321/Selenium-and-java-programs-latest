package stringclassprograms;

public class Removespecialchars {

	public static void main(String[] args) {

		String s="@#$%^*((MOunik())90899";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
			
		System.out.println(s);

	}

}
