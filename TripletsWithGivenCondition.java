/*
Program to count the number of triplets that satisfy the given condition 
Given an array arr such that length of arr is l. 
We need to find Number of triplets i,j,k values such that 
0<= i < j <=k < l 
 such that 
 x = arr[i] ^ arr[i+1] ..... arr[j-1] 
 y = arr[j] ^ arr[j+1] ..... arr[k] 
 x = y. 
 
 First of we are going the subarray where the xor of all elements is zero.
 Let us consider an example : 1 2 3 4 4 3 2 5 1
 Let us run outer loop with variable i from 0 to l 
 let us run the inner loop with variable k from i+1 to l. 
 if the found the subarray where the xor is zero. then the number of triplets will be k - i. 
 Here the subarray is 2 3 4 4 3 2 
 where i = 1 , k = 6. 
 So now when we find the values of j in these 
 The splits can happen as follows where left xor = right xor. 
 1. left = 2
    right = 3^4^4^3^2 = 1 so count = 1 
 2. left = 2^3 
    right = 4^4^3^2  = 3^2 so count = 2 
 3. left = 2^3^4 
    right = 4^3^2 so count = 3 
 4. left = 2^3^4^4 = 2^3
    right = 3^2 so count = 4
 5. left = 2^3^4^4^3 = 2
    right = 2 so count = 5
 We can say count will be k - i;
 Similary there are other pairs as well which we find in the program.
*/
import java.util.List;
import java.util.ArrayList;
public class TripletsWithGivenCondition
{
	public static void main(String[] args) {
// 		List to store the values 
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(4);
        values.add(3);
        values.add(2);
        values.add(5);
        values.add(1);
        findNumberOfTriplets(values);
	}
	public static void findNumberOfTriplets(List<Integer> values){
	    int count = 0;
	    int i;
	    int k;
	    for(i = 0; i < values.size() ; i++){
	        int val = values.get(i);
	       // System.out.println(i+" " +val);
	        for(k = i+1; k < values.size(); k++){
	            val^=values.get(k);
	           if(val ==0){
	               System.out.println("The pairs can be found in the indexes " + i+" " +k);
	            count+=(k-i);
	            }
	        }

	    }
	    System.out.println("The number of triplets are " + count);
	}
}
