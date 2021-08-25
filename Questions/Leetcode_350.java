// https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        sort(nums1.begin(),nums1.end());
        sort(nums2.begin(),nums2.end());
        auto i1=nums1.begin();
        auto i2=nums2.begin();
        auto e1=nums1.end();
        auto e2=nums2.end();
        vector<int> ans;
        while(i1 < e1 && i2 < e2){
            if(*i1 == *i2){
                ans.push_back(*i1);
                i1++;
                i2++;
            }else if(*i1 < *i2){
                i1++;
            }else if(*i1 > *i2){
                i2++;
            }
        }
        return ans;
    }
};