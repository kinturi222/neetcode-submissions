class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0, right = numbers.length - 1;

        while (left< right){
            int sum = numbers[left]+numbers[right];

            if(sum > target){
                right--;
            }else if(sum < target){
                left++;
            }else{
                return new int[]{left+1, right+1};
            }
        }

        return new int[0];
    }
}

// in this approach , used two pointers left&right represents first and last element in given array , then we sum up two pointer and determin whether they are greater or less that target and move pointer accroding (If sum is greated than target we move right pointer to left and if sum is less that target we move left pointer to right )
