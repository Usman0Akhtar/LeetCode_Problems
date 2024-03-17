import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class seventeenth_march_2024 {
    public static void main(String[] args) {
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter how big the intervals array will be: ");
        int size = sc.nextInt();
        int [][] intervals = new int [size][2];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter one number of interval: ");
                intervals[i][j] = sc.nextInt();
            }
        }
        int []newInterval = new int [2];
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter one number of newinterval (max numbers 2): ");
            newInterval[i] = sc.nextInt();
        }*/
        int[][] intervals = {
            {1, 2},
            {3, 5},
            {6, 7},
            {8, 10},
            {12, 16}
        };
        int[] newInterval = {4, 8};
        int[][] result = insert(intervals, newInterval);
    // Print the result
    for (int[] interval : result) {
        System.out.print("[");
        for (int i = 0; i < interval.length; i++) {
            System.out.print(interval[i]);
            if (i < interval.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    }
    //runtime 1ms below
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        
       
        int counter = 0;
        while (counter < intervals.length && intervals[counter][1] < newInterval[0]) {
            result.add(intervals[counter]);
            counter++;
        }
        
       
        while (counter < intervals.length && intervals[counter][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[counter][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[counter][1]);
            counter++;
        }
        
        
        result.add(newInterval);
        
        
        while (counter < intervals.length) {
            result.add(intervals[counter]);
            counter++;
        }
        
        return result.toArray(new int[result.size()][]);
    }
}
