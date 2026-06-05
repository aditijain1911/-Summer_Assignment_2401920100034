
public class longest_common_prefix {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty())
                return "";

        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String ans = new longest_common_prefix().longestCommonPrefix(strs);
        System.out.println(ans);

    }
}
