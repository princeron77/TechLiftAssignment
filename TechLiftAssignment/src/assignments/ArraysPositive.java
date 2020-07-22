package assignments;
public class ArraysPositive {
	 static void printTwoElements(int arr[], int size) 
	    { 
	        int i; 
	        System.out.print("Repeat Number : "); 
	        for (i = 0; i < size; i++) { 
	            int abs_val = Math.abs(arr[i]); 
	            if (arr[abs_val - 1] > 0) 
	                arr[abs_val - 1] = -arr[abs_val - 1]; 
	            else
	                System.out.println(abs_val); 
	        } 
	  
	        System.out.print("Missing Number : "); 
	        for (i = 0; i < size; i++) { 
	            if (arr[i] > 0) 
	                System.out.println(i + 1); 
	        } 
}
	public static void main(String args[]) {
		 int arr[] = {9,8,6,4,2,1,3,6,7,10 }; 
	        int n = arr.length; 
	        printTwoElements(arr, n); 
}
}
