
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n= sc.nextInt();
		
		int arr[] = new int[n];
		int sum = 0;
		int avg ;
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter element at position "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		
		//Display Array
		System.out.println("Array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("\nSum of all array elements is : "+sum+ " ");
		System.out.println("\nAverage of array elements is : "+(sum/arr.length));
	}
}
