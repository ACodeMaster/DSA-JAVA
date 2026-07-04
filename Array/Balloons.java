// find the min number of arrows needed to burst balloons. some balloons are placed around x axis
// & coordinates of each balloon are given as input i.e. starting and ending point along x axis.
//  Some balloons may overlap each other. an arrow will burst balloon if it passes vertically through
//  it or even if it touches it. The arrows are shot from x axis

//  eg...coords[][] = {{1,3},{4,5}}, no_arrows = 2
//  eg...coords[][] = {{1,3},{3,5}}, no_arrows = 1
//  eg...coords[][] = {{10,13},{3,5},{5,7},{1,5},{2,6},{12,14}}, op=2

// justification for last eg... if arrow is shot vertically from x axis from position 5it will burst{3,5},{5,7},{1,5},{2,6}

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Balloons {
    public static void main(String[] args) {
//        int coords[][] = {{10,13},{3,5},{5,7},{1,5},{2,6},{12,14}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of alloons : ");
        int nob = sc.nextInt();
        int coords[][]= new int[nob][2];//no. of rows = no. of balloonsbcz we want to store only start and end
        System.out.println("Enter data of "+nob+" balloons");
        
        for(int i=0;i<nob;i++){
            System.out.println("Enter start and end of ballon no "+(i+1)+" : ");
            coords[i][0] = sc.nextInt();
            coords[i][1] = sc.nextInt();
        }
        System.out.println("Number of arrows to burst "+nob+" balloons is"+countArrows(coords));

    }
    public static int countArrows(int coords[][]){
        //sort the matrix on end point of balloon id asc order
        Arrays.sort(coords,new MyComparator());
        int no_arrows = 1;  //min 1 arrow will require
        int end_pt = coords[0][1];  //end pt of 1st balloon is. now as a matrix contains nos in asc order by end pt of eah balloon all balloons which are below the 1st one are 100% to the farthest side of balloon However the qn is whether the starting point of these balloons is before the end point of 1st balloon? if yes it means these balloons overlap & have a common pt on x axis that is end pt of 1st balloon and all can burst if arrow is shot from this pt


        for(int i=1;i<coords.length;i++){
            if(coords[i][0]<end_pt){
                continue;
            }
            else{
                no_arrows++;
                end_pt = coords[i][1];// shift to next balloons end pt and continue to find overlapping ballons with this balloon
            }
        }
        return no_arrows;
    } 
}

class MyComparator implements Comparator <int []>{  //though int is primitive dtype ,array in java is object type
                                                    //this is bcoz collections framework is designed to work on object types only
    //compulsory t ooverride the compare method 
    public int compare(int a[], int b[]){
        if(a[1]>b[1]){
            return 1;   // swathe rows of coords[][]
        }
        else{
            return -1;  //dont swap
        }
    }

}

