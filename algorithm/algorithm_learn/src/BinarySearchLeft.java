public class BinarySearchLeft {

    /**
     * 二分搜索左边界
     *
     * @param nums   数组
     * @param target 目标
     * @return int
     */
    static int binarySearchLeft(int nums[], int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,6,6,6,6,7,8,9,20};
        System.out.println(binarySearchLeft(nums,6));
    }
}