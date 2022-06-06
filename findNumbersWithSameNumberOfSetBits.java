/******************************************************************************
    given a number n we need to find count of numbers in the range 0  to n - 1 having same number of set bits as n.
    
    For example : n = 8 the output should be 3. 
    Since 8 = 100
    The numbers that have only one set bit are 1,2,4.
    
    Approach for the Problem.
    
    Given number 8 : 
    Step 1 : We need to find the number of set bits in the given number.
    Step 2 : We need to find the first set from left. 
             When we come across the first set bit we can either keep the set as 1 and again call the function with set bits decreased.
             If we keep the value as zero then we will have k places left with i set bit values.
             The answer will be summation of. when we place zero at that place and when we place 1 at that place.
*******************************************************************************/
public class findNumbersWithSameNumberOfSetBits
{
	public static void main(String[] args) {
		int n = 4;
		int k = findCountOfSetBits(n);
// 		System.out.println(k);
		System.out.println("The numbers with same number of bits are "+findNumbersWithSameBits(n,k, 32));
	}
	public static int ncr(int n, int r){
	    if(n== 0){
	        return 0;
	    }
	    if(n == 1 || r == 0)
	    return 1;
	    int res = 1;
	    for(int i = 0 ; i < r; i++){
	        res*=(n - i);
	        res/=(i+1);
	    }
	    return res;
	}
	public static int findNumbersWithSameBits(int n, int numberOfbitsSet, int bitSet){
	    if(bitSet == 0){
	        return 0;
	    }
	    int mask = 1<<bitSet;
	    int res = 0;
	    if((mask & n) == 0){
	        res = findNumbersWithSameBits(n, numberOfbitsSet, bitSet - 1);
	    }else{
	        int res1 = findNumbersWithSameBits(n, numberOfbitsSet - 1, bitSet - 1);
	        int res0 = ncr(bitSet , numberOfbitsSet);
	        res = res1+ res0;
	    }
	    return res;
	}
	public static int findCountOfSetBits(int n){
	    int res = 0;
	    while(n != 0){
	        int rmsb = n & -n;
	        n-=rmsb;
	        res++;
	    }
	    return res;
	}
}
