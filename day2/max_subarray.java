import java.util.*;
class max_subarray{
    public int maxi(int[]nums){
        int n = nums.length;
        int sum =0;
        int max = nums[0];
        for(int i=0; i<n; i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int [] nums = {-1,-2, 9, 7, 8, -23};
        int ans = new max_subarray().maxi(nums);
        System.out.println(ans);

    }
}