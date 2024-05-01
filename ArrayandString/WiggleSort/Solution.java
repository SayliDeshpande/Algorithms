package ArrayandString.WiggleSort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {6,6,5,6,3,8}; //3,5,2,1,6,4
        System.out.println(Arrays.toString(wiggleSort(nums)));
    }
    public static int[] wiggleSort(int[] nums) {
        // reorder array in such a way that if number at even index in greater than its next index in the array, then swap
        // number at odd index is smaller than its next index in the array, then swap
        for(int i = 0 ; i <nums.length - 1 ; i++){
            if(i % 2 == 0 && nums[i] > nums[i + 1] || i % 2 != 0 && nums[i] < nums[i + 1]){
                swap(i, i + 1, nums);
            }
        }
        return nums;
    }

    public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
