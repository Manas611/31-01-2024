import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "ttew";

        int n = s1.length();
        int m = s2.length();

        if(n!=m)
        {
            System.out.println("NO");
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);


        for(int i=0;i<n;i++)
        {
            if(c1[i]!=c2[i])
            {
                System.out.println("No");
                break;
            }
        }

        System.out.println("Yes");
    }
}
