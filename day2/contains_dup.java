import java.util.*;
public class contains_dup {
    public boolean ans(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size()!=nums.length) return true;
        return false;
    }
    public static void main(String[]args){
        int [] nums = {1,2,12,3,4,59,5};
        boolean anso = new contains_dup().ans(nums);
        System.out.println(anso);
    }
}
