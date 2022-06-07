/******************************************************************************
Program to find the xor of sum of all pairs in the given array.
Given Array : 1,2,3,4 the should be 
The pairs that can be formed are 
with digit 1 : (1,1), (1,2), (1,3), (1,4) 
with digit 2 : (2,1), (2,2), (2,3), (2,4)
with digit 3 : (3,1), (3,2), (3,3), (3,4)
with digit 4 : (4,1), (4,2), (4,3), (4,4)
When we xor all the pairs then except (1,1), (2,2), (3,3), (4,4) remaining all pairs will cancel out each other.
So the final answer will be ((1+1) ^(2+2) ^ (3+3) ^(4+4))

*******************************************************************************/
public class FindXorOfAllPairs
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		findXorOfSumOfAllPairs(arr);
	}
	public static void findXorOfSumOfAllPairs(int[] arr){
	    int ans = 0;
	    for(int val : arr){
	        ans^=(2*val);
	    }
	    System.out.println(ans);
	}
}