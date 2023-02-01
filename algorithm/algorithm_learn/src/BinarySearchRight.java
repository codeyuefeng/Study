public class BinarySearchRight {

    /**
     * 二分搜索右边界
     *
     * @param nums   数组
     * @param target 目标
     * @return int
     */
    static int binarySearchRight(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (left - 1 < 0) {
            return -1;
        }
        return nums[left - 1] == target ? left - 1 : -1;

    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 9, 20};
        System.out.println(binarySearchRight(nums, 6));
    }
}