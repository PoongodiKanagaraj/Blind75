import java.util.*;
public class Main
{
    public static int findSubstring(String S1, String S2)
    {
        int len1=S1.length();
        int len2=S2.length();
        for (int i=0;i<=len2-len1;i++)
        {
            int j;
            for (j=0;j<len1;j++)
            {
                if(S2.charAt(i+j)!=S1.charAt(j))
                {
                    break;
                }
            }
            if (j==len1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String S1="for";
        String S2="geeksforgeeks";
        int index=findSubstring(S1,S2);
        System.out.println(index);
        S1="practice";
        index=findSubstring(S1, S2);
        System.out.println(index); 
    }
}
