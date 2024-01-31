import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestOccur {
    public static void main(String[] args) {
        String s = "manvi";

        Map<Character,Integer> m = new LinkedHashMap<>();
        char[] dupli = s.toCharArray();

        for(char i:dupli)
        {
            if(m.containsKey(i))
            {
                m.put(i, m.get(i)+1);
            }
            else
            {
                m.put(i, 1);
            }
        }

        char maxi = '\0';
        int maxVal = -1;
        for (char key : m.keySet())
         {
            // System.out.println(m.get(key));
            if(maxVal < m.get(key))
            {
                maxVal = m.get(key);
                maxi = key;
                // System.out.println(maxVal + " " + maxi);
            }
            // System.out.println(key + ": " + m.get(key));
        }
        System.out.println(maxi);

    }
}
