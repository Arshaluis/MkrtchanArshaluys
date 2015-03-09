             
import java.util.Arrays;

public class Bubble {
	    public static void main(String[] args) {
	        int arr[] = {5, 1, 8, 4, 10, 200, 43};
	        for (int j = 0; j < arr.length; j++) {
	            boolean sorted = true;
	            for (int i = 0; i < arr.length - 1; i++) {
	                if (arr[i] > arr[i + 1]) {
	                    int temp = arr[i];
	                    arr[i] = arr[i + 1];
	                    arr[i + 1] = temp;
	                    sorted = false;
	                }
	                if (sorted) {
	                    break;
	                }
	            }
	            System.out.println(Arrays.toString(arr));
	        }
	        System.out.println(Arrays.toString(arr));
	    }
	}