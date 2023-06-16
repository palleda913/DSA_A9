package in.recursion;

public class ProductOfArray {

	public static int findProduct(int[] arr,int n) {
		if(n<0)
		   return 1;
		
		return arr[n]* findProduct(arr, n-1);
		
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(findProduct(arr,arr.length-1));

	}

}
