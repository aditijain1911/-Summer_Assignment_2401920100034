class valid_palindrome {
    public boolean ans(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
    public static void main(String[]args){
        String s = "A man, a plan, a canal: Panama";
        boolean ans = new valid_palindrome().ans(s);
        System.out.println(ans);
    }
}