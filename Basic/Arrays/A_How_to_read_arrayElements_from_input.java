import java.util.Scanner;
public  class A_How_to_read_arrayElements_from_input {
    
    public static void main(String args[]){

        // Create a Scanner Object to read input from the console.
        Scanner sc= new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

       // Create an array with the specified size
        int[] array =new int[size];

        // Ask the user to enter elements into the array
        System.out.println("Enter Elements of an array");

        // Iterate through the array to read elements one by one
        for(int i=0; i<size; i++){
            // Use nextInt() method to read the integer and assign it to the array
            array[i]= sc.nextInt();
        }
        // Print the array which read from the console
        for(int i=0; i<size; i++){
        System.out.print(array[i]+" ");
        }
        /*
         OUTPUT: 
         Enter the size of the array
         5
         Enter Elements of an array
         5 6 7 1 2
         5 6 7 1 2
         */
    }
}
