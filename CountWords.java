public class CountWords {
    public static void main(String[] args) {
        String s = "This is Avisoft";
        int n = s.length();
        int cnt = 1;

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == ' ')
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
