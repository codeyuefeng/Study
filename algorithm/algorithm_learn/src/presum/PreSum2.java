package presum;

import java.util.Arrays;

public class PreSum2 {

    public static void main(String[] args) {
        int nums[] = {3, 5, 2, -2, 4, 1};
        int preSum[] = new int[nums.length + 1];
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
        System.out.println(preSum[5] - preSum[1]);
    }
}
