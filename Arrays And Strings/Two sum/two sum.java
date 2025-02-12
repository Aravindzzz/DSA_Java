class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> big = new HashMap<>();
        int j=0;
        int compliment = 0;
       for(int i=0;i<nums.length;i++){
        compliment = target - nums[i];
        if(big.containsKey(compliment)){
            return new int[]{i,big.get(compliment)};
        }
        else{
            big.put(nums[i],i);
        }
        
        
       }
      return new int[]{};
    
        

        
    }
}
