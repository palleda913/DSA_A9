package in.recursion;

public class PowerOfTwo {

	public static boolean findPowerOfTwo(int n) {
		if(n<=0)
			return false ;
		if(n==1)
			return true ;
		if(n%2==0)
			return findPowerOfTwo(n/2);
		else
			return false;
		
	}
	public static void main(String[] args) {
		int n=3;
		
		System.out.println(findPowerOfTwo(n));

	}

}
