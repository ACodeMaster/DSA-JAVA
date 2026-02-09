import java.util.*;

class BinarySearch{

public static int BS(int Num[], int key){
        int start = 0;
        int end = Num.length-1;

        while(start <= end){
        int mid = (start + end) / 2;
          if(key == Num[mid]){
            return mid;
          }
          else if(Num[mid]<key){
            start = mid + 1;
            
          }
          else{
            end = mid -1;
          }
          
        }
    
    return -1;

}
    public static void main(String args[]){
        int Num [] = {2,4,6,8,10,12};
        int key;

        System.out.print("ENter the number to search:");
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();
        int result = BS(Num, key);
        if(result == -1){
            System.out.println("Element not found..");
        }
        else{
            System.out.println("Element Found at index:"+ result);
        }


}
}