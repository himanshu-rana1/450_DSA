package String;

import java.util.HashMap;

public class LongestSubstringWithoutRepetition {

    public static void main(String[] args) {

        String s1 = "pwwkew";
        String s2 = "bbbb";
        String s3 = "abba";

        int ans1 = lengthOfLongestSubstring(s1);
        int ans2 = lengthOfLongestSubstring(s2);
        int ans3 = lengthOfLongestSubstring(s3);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int ans=0;

        for(int i=0,j=0; j<s.length(); j++){

            if(map.containsKey(s.charAt(j)))
                i = Math.max(i,map.get(s.charAt(j)));


            map.put(s.charAt(j), j+1);

            ans= Math.max(ans, (j-i +1));
        }

        return ans;
    }
}
