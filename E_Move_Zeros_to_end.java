// Define a class named E_Move_Zeros_to_end
public class E_Move_Zeros_to_end {

    // Define a static method named swap, which swaps elements in an array
    static void swap(int arr[], int pointer, int nextPointer) {
        // Temporary variable to hold the value at pointer position
        int temp = arr[pointer];
        // Swap the value at pointer position with the value at nextPointer position
        arr[pointer] = arr[nextPointer];
        // Set the value at nextPointer position to the original value at pointer position
        arr[nextPointer] = temp;
    }

    // Define a method named moveZeros that moves all zeros to the end of an array
    public static int[] moveZeros(int n, int[] a) {
        // Initialize a pointer to keep track of the position of non-zero elements
        int pointer = 0;

        // Iterate through the array
        for (int nextPointer = 0; nextPointer < n; nextPointer++) {
            // If the element at nextPointer is zero and the element at pointer is non-zero, update pointer
            if (a[nextPointer] == 0 && a[pointer] != 0) {
                pointer = nextPointer;
            }
            // If the element at nextPointer is non-zero and the element at pointer is zero, swap the elements
            else if (a[nextPointer] != 0 && a[pointer] == 0) {
                swap(a, pointer, nextPointer);
                // Move the pointer to the next position
                pointer++;
            }
        }
        // Return the modified array
        return a;
    }

    // Define the main method for testing and example usage
    public static void main(String[] args) {
        // Example usage
        int[] array = {0, 1, 0, 3, 12};
        // Apply moveZeros method to the array
        int[] result = moveZeros(array.length, array);

        // Print the result array
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
