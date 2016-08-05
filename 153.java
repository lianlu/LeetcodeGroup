// Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//
// (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
// Find the minimum element.
//
// You may assume no duplicate exists in the array.
public class Solution {
    public int findMin(int[] nums) {
      int len = nums.length;
      int lo = 0;
      int hi = len - 1;
      while(lo < hi){
        if (nums[lo] < nums[hi]) return nums[lo];
        int mid = (lo + hi)/2;
        if (nums[mid] > nums[hi]) lo = mid + 1;
        else hi = mid;
      }
      return nums[lo];
    }
}
