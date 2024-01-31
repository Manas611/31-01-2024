import java.util.ArrayList;

public class AllSubstring {

    public static void solve(String s,int i,ArrayList<String> res)
    {
        if(i>=s.length())
        {
            return;
        }

        for(int j=i;j<s.length();j++)
        {
            res.add(s.substring(i, j+1));
        }

        solve(s, i+1, res);
    }
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();

        // for(int i=0;i<n;i++)
        // {
        //     String str = "";
        //     for(int j=i;j<n;j++)
        //     {
        //         str+=s.charAt(j);
        //         System.out.println(str);
        //     }
        // }
        
        ArrayList<String> res = new ArrayList<>();
        solve(s,0,res);

        System.out.println(res);
    }
}
