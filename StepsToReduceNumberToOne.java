/******************************************************************************
Given a number determine the number of operations to reduce the number to 1.
Here we can observe Pattern for the number. 
If the number is divisble by 2 then we divide by 2.
If the number is 3 then we reduce the number by 1. 
If the number is off the form 4x + 1 then we reduce the number by 1 
If the number is off the form 4x + 3 then we increase the number by 1.

Ex : 15 Then the output will be 
step 1 : since the given number is off the form 4x + 3. so we increment it by 1 : 16
step 2 : Since it is divisible by 2 so divide it by 2 , value will be 8. 
step 3 : Since it is divisible by 2 so divide it by 2 , value will be 4.
step 4 : Since it is divisible by 2 so divide it by 2 , value will be 2.
step 5 : Since it is divisible by 2 so divide it by 2 , value will be 1.

So the number of steps required are 5. 
*******************************************************************************/
public class StepsToReduceNumberToOne
{
	public static void main(String[] args) {
		System.out.println("The number of steps required to reduce the given number to 1 are : " + findNumberOfSteps(15));
	}
	
	public static int findNumberOfSteps(int number){
	   //  variable to store the number of the steos. 
	   int numberOfSteps = 0;
	   //checking whether the number is equal to 1. 
	   while(number != 1){
	       if(number%2 == 0){
	           //reducing the number to half 
	           number>>=1;
	       }else if(number == 3){
	           number-=1;
	       }
	       // Doing and operation with 3 if it produces 1 then it is of the form 4x + 1 
	       else if((number & 3) == 1){
	           number -=1;
	       }
	        // Doing and operation with 3 if it produces 3 then it is of the form 4x + 3
	       else if((number & 3) == 3){
	           number+=1;
	       }else{
	           continue;
	       }
	       numberOfSteps++;
	   }
	   return numberOfSteps;
	   
	}
}
