import java.util.*;

public class RemoveChar {
    public static void main(String[] args) {
        // String s = "aabccbaa";
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        char x = 'a';
        int  n = s.length();

        String ans = "";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) != x)
            {
                ans = ans + s.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
