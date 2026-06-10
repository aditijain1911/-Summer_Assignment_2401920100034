import java.util.*;
class buy_sell_stocks{
    public int ans(int [] nums){
        int n = nums.length;
        int min = nums[0];
        int max =0;
        for(int num : nums){
            if(num<min){
                min = num;
            }
            else{
                max = Math.max(max, num-min);
            }
        }
        return max;
    }
    public static void main(String[]args){
        int [] nums = {7,1,5,4};
        System.out.println(new buy_sell_stocks().ans(nums));
    }
}