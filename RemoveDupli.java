public class RemoveDupli {
    public static void main(String[] args) {
        String s = "aabbbccdefdddd";
        int n = s.length();

        String ans = "";

        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i) != s.charAt(i+1))
            {
                ans = ans + s.charAt(i);
            }
        }

        char last = ans.charAt(ans.length()-1);
        if(last != s.charAt(n-1))
        {
            ans+=s.charAt(n-1);
        }
        System.out.println(ans);
    }
}
