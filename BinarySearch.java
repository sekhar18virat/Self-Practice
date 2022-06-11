/******************************************************************************
Binary Search : 
    This is the searching algorithm which is used to search the elements only if the elements are sorted. 
    If the array is sorted then time complexity will O(logn) whereas for linear Search the Time Complexity is O(n).
    The Approach is that we have two pointers low and high. And we calculate mid.
    And after calculating the mid. We are going to move indexes like this. 
    
    1. arr[mid] == element then we return mid.
    2. arr[mid] > element then we make high = mid - 1
    3. arr[mid] < element then we make low = mid + 1
    
    If low crosses the high then we return -1 so that the element is not found.
*******************************************************************************/
public class BinarySearch
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int low = 0;
		int high = arr.length - 1;
		int element = 4;
		System.out.println("The element is found at " + findIndexOfElement(arr, low, high, element));
	}
	public static int findIndexOfElement(int[] arr, int low, int high, int element){
	    while(low < high){
	        int mid = low + (high - 1)/2;
	        if(arr[mid] == element) return mid;
	        else if(arr[mid] < element) low = mid + 1;
	        else mid = high - 1;
	    }
	    return -1;
	}
}
