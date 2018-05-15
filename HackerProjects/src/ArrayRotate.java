import java.util.Scanner;

public class ArrayRotate {
	public static int[] rotateArray(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;
        
        // Create new array for rotated elements:
        int[] rotated = new int[n]; 
        
        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);
        
        /* arraycopy(Object source_arr, int sourcePos,
                Object dest_arr, int destPos, int len)
Parameters : 
source_arr : array to be copied from
sourcePos : starting position in source array from where to copy
dest_arr : array to be copied in
destPos : starting position in destination array, where to copy in
len : total no. of components to be copied.*/

        return rotated;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] numbers = new int[n];
        
        // Fill initial array:
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        
        // Rotate array by d elements:
        numbers = rotateArray(numbers, d);
        
        // Print array's elements as a single line of space-separated values:
        for(int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    } 
        
}
