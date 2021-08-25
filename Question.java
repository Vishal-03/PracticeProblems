package com.company;

import java.util.ArrayList;
import java.util.Arrays;

//  https://leetcode.com/problems/intersection-of-two-arrays/

public class Question {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        ArrayList<Integer> ans = intersection(nums1,nums2);
        System.out.println(ans);
    }
    static ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int start1=0;
        int end1 = nums1.length;

        int start2 = 0;
        int end2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
//        int[] ans = new int[1000];
        while(start1 < end1 && start2 < end2){
            if(nums1[start1] == nums2[start2]){
                list.add(nums1[start1]);
                start1++;
                start2++;
            }else if(nums1[start1] < nums2[start2]){
                start1++;
            }else if(nums1[start1] > nums2[start2]){
                start2++;
            }
            while(start1 > 0 && start1 < end1 && nums1[start1] == nums1[start1-1]) start1++;
            while(start2 > 0 && start2 < end2 && nums2[start2] == nums2[start2-1]) start2++;
        }
        return list;
    }
}
