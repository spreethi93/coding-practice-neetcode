class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        var setArr = new Set(nums);
        if(setArr.size < nums.length) return true
        return false
    }
}
