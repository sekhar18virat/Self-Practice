/* For the given array we have all the elements starting from 1 to n.
*  where one element is missing and one element is occuring twice.
*  For Example : [1,3,4,5,2,2] here we have elements that are in range in 1 to 6.
*  Here 2 is the repetitive element. 
*  Where 6 is the missing element
*/
import java.util.List;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    List<Integer> values = new ArrayList<>();
	   // In the given values the values are there from 1 to n.
	   // And one value is repeating and one value is missing. 
	   // We need to find the values that is missing and one values that has occured twice.
	    values.add(1);
	    values.add(3);
	    values.add(2);
	    values.add(4);
	    values.add(2);
	    findElementMissedAndRepeating(values);
	}
	public static void findElementMissedAndRepeating(List<Integer> values){
	   //  Finding the element that is xor of the repeated elements.
	    int xorValue = 0;
	   //  Xor Value of the value.
	    for(int val : values){
	        xorValue^= val;
	    }
	   // Xor the elements with 1 to n. So that The same occuring elements cancel out each other.
	    for(int i = 1; i <= values.size() ; i++){
	        xorValue^=i;
	    }
	   // Variables to store the repeat elements and missing element.
	    int xValue = 0;
	    int yValue = 0;
	  //  Finding the rightmost set bit.
	    int rmsb = xorValue & (-xorValue);
	  // Seperating the elements based on the right most set bit. And xor operation with xValue
	    for(int val : values){
	        if((val & rmsb) == 0){
	            xValue^= val;
	        }else{
	            yValue^= val;
	        }
	    }
	   // We Xor Value with 1 to n.
	   for(int i = 1; i <= values.size() ; i++ ){
	        if((i  & rmsb) == 0){
	            xValue^= i;
	        }else{
	            yValue^= i;
	        }
	    }
	  // Checking and printing the elements that is missing and the element that is repeating.
	    for(int val : values){
	        if(val == xValue){
	            System.out.println("Missing value is " + yValue);
	            System.out.println("Repeating value is " + xValue);
	            break;
	        }
	        	  if(val == yValue){
	            System.out.println("Missing value is " + xValue);
	            System.out.println("Repeating value is " + yValue);
	            break;
	        }
	    }
	}
}
