// Program to find the element that has occured only once.
// In the given array where all the other elemetns have occured twice.
// We can do xor with elements that will give the element that has occured once.
// Let us consider the array as 1,1,5,6,5,6,7,8,9,9,8
// In the above example the elements 1,5,6,8,9 have occured twice.
// The element 1 has occured only once.
import java.util.List;
import java.util.Arrays;
public class OneRepeatedElement
{
	public static void main(String[] args) {
	   // Intializing the list
	    List<Integer> integers = Arrays.asList(1,1,5,6,5,6,7,8,9,9,8);
	   // Intializing the repeated element with first element of the array.
	    int onlyOnceRepeatedElement = integers.get(0);
	   // Iterating the integers array and performing the xor performation
		for(int i : integers){
		  //  performing the xor operation.
		    onlyOnceRepeatedElement^= i;
		}
// 	 Priniting the element only once repeated.
		System.out.println(onlyOnceRepeatedElement);
	}
}
