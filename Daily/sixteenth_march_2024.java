package Daily;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sixteenth_march_2024 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]= sc.nextInt();
        }
        System.out.println(findMaxLength(nums));
    }
    public static int findMaxLength(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        int subArrayLength = 0;
        for (int i = 0; i < len; i++) {
            counter += nums[i] == 0 ? -1 : 1;
            if (counter == 0) {
                subArrayLength = i + 1;
            } else if (map.containsKey(counter)) {
                subArrayLength = Math.max(subArrayLength, i - map.get(counter));
            } else {
                map.put(counter, i);
            }
        }
        return subArrayLength;
    }
}
