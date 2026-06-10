class move_zero{
    public int [] ans(int [] nums){
        int n = nums.length;
       int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
         
        }
        while(j<n){
            nums[j]= 0;
            j++;
        }
        return nums;
   }
   public static void main (String [] args){
    int [] nums = {0,1,0,3,12};
    int [] ans = new move_zero().ans(nums);
    for(int i=0; i<ans.length; i++){
        System.out.println(ans[i] + " ");
    }
   }
}