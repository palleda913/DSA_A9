package in.recursion;

public class SumOfNaturalNumbers {

	public static int findSumOfNaturals(int n) {
		if(n==0 || n==1)
			return n ;
		
		return n+findSumOfNaturals(n-1);
		
	}
	public static void main(String[] args) {
		int n=5;
		
		System.out.println(findSumOfNaturals(n));

	}

}
