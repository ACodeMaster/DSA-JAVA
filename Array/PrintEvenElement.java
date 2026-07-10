
import java.util.*;
public class PrintEvenElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter element at position "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("\nArray is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//print even elements
		System.out.println("\nEven Elements are : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
