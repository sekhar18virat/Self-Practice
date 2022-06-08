/******************************************************************************

Linear Search : 
Given an array we need to find the first index of occurence of the element.

Ex : Given Array : 5, 2, 4, 1, 0, 1, 3 
     element = : 1 
     The return value should be 3. 
    SInce 1 occured first time at the index 3. 
    
    Approach : We are going to iterate the array element by element which takes O(n) 
    where n is the size of the array. 
*******************************************************************************/
class LinearSearch{
    
    public static void main(String[] args){
        int[] arr = {5, 2, 4, 1, 0, 1, 3};
        int element = 1; 
        System.out.println("The given element " + element + " Occured at "+ linearSearch(arr, element));
    }
    public static int linearSearch(int[] arr, int element){
        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] == element)
            return i;
        }
        // If the element is not found in the array.
        return -1;
    }
}
