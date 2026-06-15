/*
Problem: Two Sum
Difficulty: Easy

Approach:
1. Used HashMap to store number -> index.
2. For each element, calculate diff.
3. If diff exists, return indices.

Time Complexity: O(n)
Space Complexity: O(n)
*/
package arrays;
import java.util.HashMap;
import java.util.Arrays;

public class Main {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}