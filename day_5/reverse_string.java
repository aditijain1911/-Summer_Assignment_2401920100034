

public class reverse_string {
    public void reverseString(char[]s){
        char[] ans = new char[s.length] ;
        int k=0;
        for(int i=s.length-1; i>=0; i--){
            ans[k++] = s[i]; 
        }
        for(int i=0; i<s.length; i++){
            s[i] = ans[i];
        }
    }
    public static void main(String[]args){
        char[] s = {'h','e','l','l','o'};
        new reverse_string().reverseString(s);
        for(char c : s){
            System.out.print(c + " ");
        }
    }
}
