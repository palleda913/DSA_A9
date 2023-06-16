package in.recursion;

public class MaximumElement {
	
	 public static int findMaximumElement(int[] arr, int start, int end) {
	        if (start == end) {
	            // Base case: Only one element in the array
	            return arr[start];
	        }

	        int mid = (start + end) / 2;

	        int maxLeft = findMaximumElement(arr, start, mid);
	        int maxRight = findMaximumElement(arr, mid + 1, end);

	        return Math.max(maxLeft, maxRight);
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 4, 3, -5, -4, 8, 6};
	        int max1 = findMaximumElement(arr1, 0, arr1.length - 1);
	        System.out.println("Maximum element in arr1: " + max1);

	    }

}
