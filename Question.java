package com.company;
//  https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/
public class Question {
    public static void main(String[] args) {
        int arr[][] = {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        System.out.println(countNegative(arr));
    }
    static int countNegative(int[][] arr){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] < 0){
                    cnt += arr[i].length - j;
                    break;
                }
            }
        }
        return cnt;
    }
}
