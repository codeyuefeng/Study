package presum;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int diff[] = Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
        // 3~4 +=3
//        diff[3] += 3;
//        diff[5] -= 3;
//        System.out.println();
//        for (int i = 1; i < diff.length; i++) {
//            nums[i]=diff[i] + nums[i - 1];
//            System.out.println(nums[i]);
//        }
        // 3~4 -=3
        diff[3] -= 3;
        diff[5] += 3;
        System.out.println();
        for (int i = 1; i < diff.length; i++) {
            nums[i]=diff[i] + nums[i - 1];
            System.out.println(nums[i]);
        }
    }
}
