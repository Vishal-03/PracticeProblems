package com.company.Questions;

public class LeetCode_888 {
    public static void main(String[] args) {
    }
    static class Solution {
        public int[] fairCandySwap(int[] arr1, int[] arr2) {
            int[] ans = new int[2];
            int sum1 = 0;
            int sum2 = 0;
            for(int i=0;i<arr1.length;i++){
                sum1+=arr1[i];
            }
            for(int i=0;i<arr2.length;i++){
                sum2+=arr2[i];
            }
            int diff = (sum1 - sum2) / 2;
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if((arr1[i] - arr2[j]) == diff){
                        // return new int[]{arr1[i] , arr2[j]};
                        ans[0] = arr1[i];
                        ans[1] = arr2[j];
                        break;
                    }
                }
            }
            return ans;
        }
    }
}
