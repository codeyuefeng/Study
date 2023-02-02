package presum;

public class PreSum {

    static int[] preSum;

    static void caculatePreSum(int nums[]) {
        preSum = new int[nums.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    static int rangeSum(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }

    public static void main(String[] args) {
        int nums[]={3,5,2,-1,4,1};
        caculatePreSum(nums);
        System.out.println(rangeSum(0,1));

    }
}
