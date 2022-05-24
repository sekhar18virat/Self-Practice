/*Explanation of the solution
 *  let us assume n = 7 
 *   1 - 0001
 *   2 - 0010
 *   3 - 0011
 *   4 - 0100
 *   5 - 0101
 *   6 - 0110
 *   7 - 0111
 * 
 * In the round 1 - the element who least significant bit is zero are eliminated - 2,4,6 now consider lsb of last soldier i.e. 
 * for 7 lsb is 1. So now the elements whose second last bit is 0 will be eliminated.
 * Now the eliminated soldiers are - 1, 5
 * Now the  second most lsb of last soldier is 1. the soldiers whose third most lsb is zero are eliminated.
 * 3 will be eliminated 
 * And the final answer will be 7.
 * 
 * 
 * 
 * */

// The problem statement is that every soldier will kill alternate soldier we need to find the soldier who remains at the end
public class SoldierKilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		let us we are with soldiers 7. 1,2,3,4,5,6,7 then
//		 round 1 survived - 1,3,5,7
//		round 2 survived - 3,7
//		finally the answer is 7.
//		 any number can be represented as 2^x + l. and our anwer will be 2^l + 1
		int x = 6;
		System.out.println("The final soldier left is "+findSoldier(x));
	}

	private static int findSoldier(int x) {
		// TODO Auto-generated method stub
//		finding the l value
		int twoPower = findTwoPower(x);
//		returning 2*l + 1
		return 2*twoPower + 1;
	}

	private static int findTwoPower(int x) {
		// TODO Auto-generated method stub
//		calculating the value of two power
		int i = 1;
		while(i*2 <= x) {
			i*=2;
		}
		return x - i;
	}

}
