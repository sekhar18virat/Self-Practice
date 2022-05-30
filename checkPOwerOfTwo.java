public class checkPowerOfTwo
{
	public static void main(String[] args) {
		int a = 108;
		if(isPowerOfTwo(a)){
		    System.out.println("Given number is power of two : " + a);
		}else{
		    System.out.println("Given number is not a power of two : " + a);
		}
	}
// Function to check the number is power of two or not.
	public static boolean isPowerOfTwo(int a){
// count variable to count the number of set bits in given number
	            int count = 0;
// flag to keep track whether the number is power of two.
	    boolean isPowerOfTwo = true;
// if the number is less than or equal to zero then it is not power of two.
        if(n <= 0){
            return false;
        }
// check for the number of set bits
		while(n > 0){
// by doing and operation with -ve number we get rightmost set vit value 
		    int rmsbt = (n &(-n));
		    // substracting the rightmost set bit from the original number
		    n-= rmsbt;
// 		    increasing the count for the number of set bits.
		    count+=1;
// if the count is greater than 1 then the number is not power of two.
            if(count > 1){
// making the flag value as false.
                isPowerOfTwo = false;
// returning the flag value.
                return isPowerOfTwo;
            }
		}
//  If we come across this situation then we return true value
		return isPowerOfTwo;
	}
}
