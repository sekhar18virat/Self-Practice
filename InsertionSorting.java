/******************************************************************************
Insertion sort is an inplace algorithm that is going to sort the items in the array itself.
Whenever we come across the element we are going to compare with all the elements that are previous to the array elemnts.
We find the place. 
*******************************************************************************/
public class InsertionSorting
{
	public static void main(String[] args) {
// 		Way to implement insertion sort. 
        int[] nums = {1, 2, 6, 3, 4, 5};
        // calling the insertion sort by passing parameters as array and length of the array.
        insertionSort(nums, nums.length);
	}
	
	public static void insertionSort(int[] nums, int length){
	   // Iterating the loop with elements starting from 1st element.
	    for(int i = 1; i < length; i++){
	       // Intitalizing the j variable to keep track of the previous elements
	        int j = i - 1;
	       // storing the ith element 
	        int key = nums[i];
	       // comparing the previous elements with ith element and swapping the element with nextelement 
	        while(j >= 0 && nums[j] > key){
	            nums[j+1] = nums[j];
	            j--;
	        }
            //  Placing the element in the correct position.
	        nums[j+1] = key;
	    }
	   // printing the array elements after sorting.
	    for(int i : nums){
	        System.out.print(i + " " );
	    }
	}
}
