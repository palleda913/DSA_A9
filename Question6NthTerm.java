package in.recursion;

public class Question6NthTerm {

	public static int findNthTerm(int a,int d,int N) {
		return a+(N-1)*d;
	}
	
	public static void main(String[] args) {
		int a = 2 ,d = 1, N = 5;
		System.out.println(findNthTerm(a, d, N));
		

	}

}
