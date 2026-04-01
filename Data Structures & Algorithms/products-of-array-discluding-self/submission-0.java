class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] prefix = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            prefix[i] = product;
            product *= nums[i];
        }
        product = 1;
        int[] suffix = new int[nums.length];
        for(int i = nums.length-1;i >= 0;i--){
            suffix[i] = product;
            product *= nums[i];
        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = prefix[i] * suffix[i];
        }
        return nums;
    }
}  
