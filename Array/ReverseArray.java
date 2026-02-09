import java.util.*;
class ReverseArray{
    
    public static void RA(int Numbers[]){
        int start =0;
        int end = Numbers.length -1 ;

           while(start<end){
                int temp = Numbers[start];
                Numbers[start] = Numbers[end];
                Numbers[end] = temp;

                start ++;
                end --;
            
        }
    }

    public static void main(String args[]){
        int Numbers[] = {2,4,6,8,10};
        System.out.print("Given Array is:");
        for (int i=0; i<Numbers.length; i++){
            System.out.print(Numbers[i]+" ");
        } 
        System.out.println();
        RA(Numbers);
        System.out.print("After reversing array :");
        for (int i =0; i<Numbers.length; i++){
            System.out.print(Numbers[i]+" ");
        }
        
    }
}