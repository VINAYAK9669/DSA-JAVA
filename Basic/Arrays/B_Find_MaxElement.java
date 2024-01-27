/*
 * TASK -2
 * Find the maximum element in an array
 * You need to read the input from the console.
 * If there is no Maximum element occurs [all are same ] then return -1
 */

import java.util.Scanner;

public class B_Find_MaxElement{

    public static int finMaxElem(int arr[],int size){
       
       int maxElem= arr[0];
       boolean allSame = true;

       for(int i=1; i<size; i++){
        if(arr[i] != arr[0]){
            allSame = false;
        }
        maxElem = Math.max(maxElem, arr[i]);
       }
       if(allSame)
       {
        return -1;
       }
       return maxElem;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

        int array[] = new int[size];
        
        System.out.println("Enter Elements to add in an Array");

        for(int i= 0; i<size;i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(finMaxElem(array, size));

    }
}