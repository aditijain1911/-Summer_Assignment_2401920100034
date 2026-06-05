import java.util.*;
class remove_dup_from_sorted_array{
    public int ans(int []nums){
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }return i+1;
    }
    public static void main(String[]args){
        int [] nums = {1,1,1,1,1,1,4,44,44,44,6,6,6666,6666};
        System.out.println(new remove_dup_from_sorted_array().ans(nums));
    }
}