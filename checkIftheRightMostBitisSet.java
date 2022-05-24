public class checkIftheRightMostBitisSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can check if the right most bit is set by doing the and operation with 2's complement of the given value
//		let us say a variable.
		int x = 3; // binary represntation is 1011 here right most bit is set 
		// if we pass x = 6(1010) the output will be 2 since the right most set bit is at location 2
		if((x & (-x)) == 1) {
			System.out.println("Right most bit is set");
		}else {
			System.out.println("The bit that is first set from right is at position " + (x & (-x)));
		}
	}

}