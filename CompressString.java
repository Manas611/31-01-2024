public class CompressString {
    public static void main(String[] args) {
        String s = "xxxxaaddxxfff";
        int n = s.length();
        
        int cnt = 1;
        String ans = "";
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                cnt++;
            }
            else if(cnt != 1)
            {
                ans += s.charAt(i);
                ans = ans + Integer.toString(cnt);
                cnt = 1;
            }
            else
            {
                ans = ans + s.charAt(i);
            }
        }

        if(cnt!=1)
        {
            ans += s.charAt(n-1);
            ans = ans + Integer.toString(cnt);
        }
        else if(cnt == 1)
        {
            ans = ans + s.charAt(n-1);
        }
        System.out.println(ans);
    }
}
