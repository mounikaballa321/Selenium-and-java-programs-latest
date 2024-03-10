package stringclassprograms;

public class ReverseString {

	public static void main(String[] args) {
		 String s="Selenium java many";
		 
		 // To reverse each letter in string
		StringBuffer sf=new StringBuffer(s);
		 System.out.println(sf.reverse());
		 
		 //To reverse words in string
		 
		 
		 String s1="My Name is Mounika";
		 
		 String[] words=s1.split(" ");
		 
		 int len=words.length;
		 
		 for(int i=len-1;i>=0;i--) {
			 
			 System.out.print(words[i]+ " ");
		 }
		 
				 

	}

}
