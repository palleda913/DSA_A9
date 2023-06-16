package in.recursion;

public class ExponentOfNum {

	public static int findPowerOfNum(int n,int p) {
		if(p==1)
			return n ;
		
		return n*(findPowerOfNum(n,p-1));
		
	}
	public static void main(String[] args) {
		int n=5,p=2;
		
		System.out.println(findPowerOfNum(n,p));

	}

}
