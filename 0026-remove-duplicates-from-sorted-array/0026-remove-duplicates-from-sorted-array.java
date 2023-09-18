class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j;
        for(j = 0 ; j< n-1; j++){
            if(nums[j+1]!=nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }
        nums[i]=nums[j];
        i++;
        return i;
    }
}