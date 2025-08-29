class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] resArray = new int[n];

        resArray[0] = 1;
        for(int i=1; i<n; i++) {
            resArray[i] = resArray[i-1] * nums[i-1];
        }
        
        int postfix = 1;
        for(int i=n-1; i>=0; i--) {
            resArray[i] *=  postfix;
            postfix *= nums[i];
        }

        return resArray;

    }
}  
