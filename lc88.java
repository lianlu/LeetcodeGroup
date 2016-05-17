// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
// Note:
// You may assume that nums1 has enough space (size that is greater or equal to m + n) to
// hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int index = m + n - 1;
      int i = m - 1;
      int j = n - 1;
      while(index >= 0){
        if (i >= 0 && j >= 0){
          if (nums1[i] > nums2[j])
            nums2[index--] = nums2[j--];
          else nums2[index--] = nums1[i--];
        }
        else if (i >= 0){
            nums2[index--] = nums1[i--];
        }
        else if (j >= 0){
            nums2[index--] = nums2[j--];
        }
        else break;
      }
    }
}