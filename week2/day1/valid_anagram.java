package week2.day1;

import java.util.HashMap;

public class valid_anagram {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        HashMap<Character, Integer> map = new HashMap<>();
        if(sl != tl) return false;
        for(int i=0; i<sl; i++){
            char sm = s.charAt(i);
            char tm = t.charAt(i);
            map.put(sm, map.getOrDefault(sm,0)+1);
            map.put(tm, map.getOrDefault(tm,0)-1);
        }
        for(int i : map.values()){
            if(i!=0) return false;
        }
        return true;
    }
}
