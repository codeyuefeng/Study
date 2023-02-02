package binarysearch;

public class BinarySearch {

    static int binarySearch(int nums[], int target, int left, int right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, right);
        } else {
            return binarySearch(nums, target, left, mid - 1);
        }
    }

    static int binarySearch2(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 9, 10};
        System.out.println(binarySearch(nums, 10, 0, nums.length - 1));
        System.out.println(binarySearch2(nums,6));
    }
}
