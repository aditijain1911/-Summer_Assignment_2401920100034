public class max_avg_subarry_1 {
    public double ans(int[]nums, int k){
        int n = nums.length;
        int sum =0;
        int max = nums[0];
        for(int i=0; i<k; i++){
            sum+=nums[i];

        }
        max = sum;
        for(int i=k; i<n; i++){
            sum += (nums[i] - nums[i-k]);
            max = Math.max(max, sum);
        }
        return (double)max/k;
    }
    public static void main(String args[]){
        int [] nums = {1, 12, -5, -6, 50, 3};
        double ans = new max_avg_subarry_1().ans(nums, 4);
        System.out.println(ans);

    }
}
