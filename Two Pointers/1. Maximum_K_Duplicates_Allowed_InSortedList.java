class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        int j=1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){ //If adjacent numbers are same, counter increases
                counter++;
            }else{
                counter = 1; //reset back to 1
            }    
            if(counter<=2){//i moves faster than j. 
                /*J stands for place to be replaced and i stands for place to replace*/
                nums[j] = nums[i]; //replace the values to the front
                j++;//j moves only after replacing
            }
        }
        return j;//this is the answer - till here it is sorted
    }
}