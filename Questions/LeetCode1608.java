package com.company.Questions;

public class LeetCode1608 {
    public static void main(String[] args) {
    }
    class Solution {
        public int specialArray(int[] arr) {
            int cnt = 0;
            for(int i=0;i<1000;i++){
                for(int j=0;j<arr.length;j++){
                    if(i <= arr[j]){
                        cnt++;
                    }
                }
                if(cnt == i){
                    return cnt;
                }
                cnt = 0;
            }
            return -1;
        }

    }
}
