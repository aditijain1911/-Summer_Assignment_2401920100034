class container_with_water{
    public int ans(int [] nums){
        int n = nums.length;
        int l=0;
        int r=n-1;
        int maxi = Integer.MIN_VALUE;
        while(l<r){
            int area = (r-l) * Math.min(nums[l], nums[r]);
            maxi = Math.max(maxi,area);
            if(nums[l]<nums[r]) l++;
            else r--;
        }
        return maxi;
    }
    public static void main(String[]args){
        int []nums = {1,8,6,2,5,4,8,3,7};
        int ansi = new container_with_water().ans(nums);
        System.out.println(ansi);

    }
}