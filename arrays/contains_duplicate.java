package arrays;

import java.util.HashSet;
import java.util.Set;

public class contains_duplicate {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

        }
        return false;
    }

    public static void main(String args[]){
        int[] nums ={1,2,3,2};
        System.out.println(hasDuplicate(nums));
    }
}

