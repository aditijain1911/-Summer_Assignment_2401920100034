package week2.day1;

public class ransom_note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r = ransomNote.length();
        int m = magazine.length();
       int [] freq = new int[26];
       for(int i=0;i<m ; i++){
        freq[magazine.charAt(i)-'a']++;
       }
       for(int i=0; i<r; i++){
        freq[ransomNote.charAt(i)-'a']--;
        if(freq[ransomNote.charAt(i)-'a']<0) return false;
       }
       return true;
    }
}
