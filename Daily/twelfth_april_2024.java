//Runtime 0ms
import java.util.Scanner;
public class twelfth_april_2024 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter heights separated by commas: ");
        String input = sc.nextLine();

        String[] heightStrings = input.split(",");
        int[] height = new int[heightStrings.length];
        for (int i = 0; i < heightStrings.length; i++) {
            height[i] = Integer.parseInt(heightStrings[i].trim());
        }

        System.out.println(trap(height)+ " Water blocks are trapped");
    }


public static int trap(int[] height) {
        int i=0;  
        int WaterCount=0; 
        int len=height.length-1;
        int l_Max=height[0];  
        int r_Max=height[len];
        while (i<len)
        {
            if(l_Max <= r_Max)
            {
                WaterCount+=(l_Max-height[i]);
                i++;
                l_Max=Math.max(l_Max,height[i]);
            }
            else 
            {
                WaterCount+=(r_Max-height[len]);
                len--;
                r_Max=Math.max(r_Max,height[len]);
            }
        }
        return WaterCount;
        
    }
}