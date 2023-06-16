package in.recursion;

public class Factorial {

	public static int findFactorialOfNum(int n) {
		if( n==1)
			return 1 ;
		
		return n*findFactorialOfNum(n-1);
		
	}
	public static void main(String[] args) {
		int n=5;
		
		System.out.println(findFactorialOfNum(n));

	}

}
