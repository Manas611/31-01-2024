public class Palidrome {
    public static void main(String[] args) {
        String s = "naany";
        int i = 0;
        int j = s.length()-1;
        boolean flag = true;

        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                System.out.println("Not");
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if(flag == true)
        {
            System.out.println("Yes");
        }
    }
}
