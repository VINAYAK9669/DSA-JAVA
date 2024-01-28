import java.util.ArrayList;

public class D_Left_Rotate_Array_by_D {
    
    static void reverse(ArrayList<Integer> arr, int start, int end){
       
       while(start <end){
           int temp =  arr.get(start);
           arr.set(start, arr.get(end));
           arr.set(end,temp);
           start++;
           end--;
       }

    }
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
    //    Check if the kth size is not greater than the length of the array
    int size= arr.size();


    // Whenever the given k element is greater than the size then after every results are same as the results obtained within k%size.

    // Avoid unneccesary iterations.
    
    if(k>size)
    {
        k = k% size;

    }

    
    // If any Negative K elements occured then it means we need to right rotate the array
    // If K= 4 ; [5, 1, 2, 3, 4] [Rotate array left by 4]
    // If K=-1 ; [5, 1, 2, 3, 4] [Rotate array right by 1]
    // Hence we can understand that left rotate by 4 = right rotate by 1
    // Now we need to set the value of the K so that it will always rotate left as per fixing the value of the K as per sign.
    // Now when the value id -1 the real value of K should convert in to 4
    // -1 + 5 = 4 , here 5 is the size of the array.
    if(k < 0)
    {
        k= k+size;
    }

    reverse(arr, 0, k-1);
    reverse(arr, k, size-1);
    reverse(arr, 0, size-1);

    return arr;

    }

    public static void main(String args[]){
        ArrayList<Integer> array = new ArrayList<>();
         array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
       System.out.println(rotateArray(array, -3)) ;
        }
}