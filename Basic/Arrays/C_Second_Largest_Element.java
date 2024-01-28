/*
 * TASK
 * To find the Second Largest Element in an array
 * If there is a no second largest element then return -1 
 * Apply all the boundary condition
 */
public class C_Second_Largest_Element {
   
      public static int secMaxNum(int arr[], int size){

            int maxNum= Integer.MIN_VALUE;
            int secMaxNum = Integer.MIN_VALUE;

             //  When the size of the array is zero we need to return secondMax always as -1
        if (size == 0) {
            // Handle the case where the array is empty
        return -1;
        }
    //  Iterate through the array to find out firstMax and secondMax
            for(int i=0; i<size; i++){
                if(maxNum < arr[i]){
                    secMaxNum =maxNum;
                    maxNum= arr[i];
                }
                else if(arr[i] > secMaxNum && arr[i] < maxNum){
                     secMaxNum= arr[i];
                }
            }
            // If the secMaxNum is same as initalized value, it means that secondMax does not exists.
            if(secMaxNum == Integer.MIN_VALUE) return -1;
            return secMaxNum;


        }
    public static void main(String args[]){

        int arr[] = {455, 455, 455 ,0,455};
        int size= arr.length;

        int result = secMaxNum(arr, size);
        System.out.println("The second Largest number in the array is = "+ result);


    }
}
