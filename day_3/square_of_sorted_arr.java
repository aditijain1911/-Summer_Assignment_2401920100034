class square_of_sorted_arr {
    public int[] ans(int [] nums){
        int n = nums.length;
        int l=0;
        int r = nums.length-1;
        int [] ans = new int[n];
        for(int i=n-1; i>=0 ; i--){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                ans[i] = nums[l] * nums[l];
                l++;
            }
            else{
                ans[i] = nums[r] * nums[r];
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [] nums = {-4,-1,0,3,10};
        int [] ansi = new square_of_sorted_arr().ans(nums);
        for(int i=0; i<ansi.length; i++){
            System.out.println(ansi[i]);
        }
    }
}