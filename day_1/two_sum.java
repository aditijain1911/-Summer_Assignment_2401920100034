import java.util.*;
class two_sum{
    public int [] twosum(int [] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int [] {i, map.get(x)};
            }
            map.put(nums[i],i);
        }
        return new int [] {-1,-1};
    }

    public static void main(String[]args){
        int [] nums={9,8,6,4,3,2,2,2};
        int target = 6;
        int [] ans = new two_sum().twosum(nums,target);
        for(int i=0; i<ans.length; i++){
            System.out.print( ans[i] + " ");

        }
    }
}
