import java.util.*;

class ContainerWithWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int left =0;
        int right = n-1;
        int MaxWater = 0;

        while(left < right){
            int width = right - left;
            int minWater = Math.min(height[left], height[right]);
            MaxWater = Math.max(MaxWater, width*minWater);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right --;
            }
        }
        return MaxWater;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int height[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            height[i] = sc.nextInt();
        }

        int result = maxArea(height);
        System.out.println("Area with water is : "+result);

    }
}
// 1,8,6,2,5,4,8,3,7