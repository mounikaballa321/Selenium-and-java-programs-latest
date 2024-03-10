package stringclassprograms;

public class PrimeNumber {
	
	//To find if num is Prime Number
	
	public static boolean isprime(int num) {
		
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//To print prime numbers on max given num
	
	public static void getprime(int num) {
		for(int i=2;i<=num;i++) {
			if(isprime(i)) {
				System.out.println(i+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(isprime(3));
		getprime(20);
	

	}

}
