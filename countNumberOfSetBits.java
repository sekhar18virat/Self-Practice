public class countNumberOfSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		we are going to make sure that we substract the rightmost set bit every time we come across it until the number goes to zero
		
//		Let us consider the example 5 (1001) here number of set bits is two
		int x = 5;
//		Let us say right most set bit is zero initially.
		int rmsb = 0;
//		let us initialize the value of count as zero
		int count = 0;
//		checking if the value is not equal to zero
		while(x != 0 ) {
//			setting the value of right most set bi
			rmsb = x & -x;
//			substracting the value right most set bit 
			x-=rmsb;
//			incrementing the count since we got the set bit
			count+=1;
		}
		
		System.out.println("The number of set bits are "+ count);
		
	}

}