import java.util.List;
import java.util.ArrayList;
/* In a given array all elements repeat twice but only two elements repeat just once 
// Find the elments that have occured just once.
//  Ex : let us consider the array as 1 2 2 3 3 4 
//  In the given array except 1 and 4 every other element occured twice. 
//  When we do Xor for all the elements then the value that we are left with is 1 xor 4 = 
//  0001
//  0100
//  The value will be 0101 i.e. 5 and we find the right most set bit i.e the value will be 0001 
//  Now let us store the value of 1 in a variable and then we xor with all other elements 
// if we get zero when we xor with an element then we store in x 
//  elese we store the element in y.
//  then we print x and y.
*/
public class findTwoNonRepetitiveElements
{
	public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(2);
        values.add(3);
        values.add(3);
        values.add(4);
        findOnlyOnceOccuredElemets(values);
	}
	public static void findOnlyOnceOccuredElemets(List<Integer> values){
	    int xorOfArray = 0;
	    for(int i : values){
	        xorOfArray ^= i;
	    }
	    xorOfArray = xorOfArray & (-xorOfArray);
	    int xValue = 0;
	    int yValue = 0;
	   // We seperate elements based on set bit at that position and we print them 
	    for(int value : values){
	        if((xorOfArray ^ value) == 0){
	            xValue ^= value;
	        }else{
	            yValue ^= value;
	        }
	    }
	    System.out.println(xValue + " " + yValue);
	}
}
