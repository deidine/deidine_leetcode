//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int[] a={};
        // int[] b={2,3};
//give size to comined list that have sum of both
        int[] conbined = new int[nums1.length + nums2.length];
// combine the 2 array
        System.arraycopy(nums1, 0, conbined, 0, nums1.length);
        System.arraycopy(nums2, 0, conbined, nums1.length, nums2.length);
        Arrays.sort(conbined);

        if ((conbined.length / 2) % 2 >0 || (conbined.length / 2) % 2 ==0) {
            double res = conbined[conbined.length / 2] + conbined[(conbined.length - 1) / 2];
            return res / 2;

        } else {
            double a = conbined[conbined.length / 2];
            return a;

        }

    }

}

/*
 * nums1
 * nums2
 * concatenat/combine both arr
 * sort merge
 * merg/2
 * odd ,ev
 * res
 * 
 */
