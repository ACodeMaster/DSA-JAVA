import java.util.*;
public class TrappedRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of bars:");
        int n = sc.nextInt();
        int height[] = new int[n];

        //User input hieght of bars
        for(int i=0; i<n; i++){
            System.out.print("Enter the size of " + (i + 1) + "st bar : ");
            height[i] = sc.nextInt();
        }

        //Display the size of bars
        System.out.print("The height of bars is : ");
        for(int i =0; i<height.length;i++){
            System.out.print(height[i]+" ");
        }

        TRW(height);
    }

    public static void TRW(int height[]){
        //calculate leftmax
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //calculate rightmax
        int rightmax [] = new int [height.length];
        rightmax[height.length-1] = height[height.length-1];

        for(int i =height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedwater = 0;
        //calculate waterlevel and trapped water
        for(int i=0; i<height.length; i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        
        System.out.print("\nThe trapped water is : "+trappedwater+" units");
    }
}
