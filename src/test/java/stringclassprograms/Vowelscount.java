package stringclassprograms;

import java.util.Scanner;

public class Vowelscount {

	public static void main(String[] args) {
		
		int vowels=0;
		int nonvowels=0;
		
		System.out.println("Enter the String");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sl=s.toLowerCase();
		
		for(int i=0;i<sl.length();i++) {
			char c=sl.charAt(i);
			if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
				vowels=vowels+1;
			}
			else {
				nonvowels=nonvowels+1;
			}
		}
		
		System.out.println("Number of Vowels Count " +vowels);
		System.out.println("Number of nonVowels Count " +nonvowels);
		
		

	}

}
