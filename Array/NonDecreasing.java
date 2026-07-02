// Given an array nos, return true if array was originally sorted in non decreasing order and then 
// rotated by some number of positions(including zero). otherwise return false.
//Non decreasing is not strictly increasing or ascending order as there may be duplicates in the array.
//i/p nos [] = {5,1,1,2,3,4}
//o/p true, i/p nos[] = {-65,0,11,10,5,-70} o/p = false
// Summary of qn is "whether the rotated array was originally sorted or not?"
import java.util.*;
public class NonDecreasing {
    public static void main(String[]args){
        int nos[] = {5,1,1,2,3,4};
        System.out.print(NonD(nos));
        
    }
    public static boolean NonD(int nos[]){
        int count = 0;
        for(int i=0;i<nos.length;i++){
            
            if(nos[i]>nos[(i+1) %nos.length]){
                count ++;
            }
        }
        if(count<=1){
            return true;
        }
        return false;
    }
}
