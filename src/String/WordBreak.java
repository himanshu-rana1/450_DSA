package String;

/*  Given a string s and a dictionary of strings wordDict,
    return true if s can be segmented into a space-separated sequence of one or more dictionary words.

    Note that the same word in the dictionary may be reused multiple times in the segmentation.
*/

import java.util.HashMap;

public class WordBreak {

    public static void main(String[] args) {

        String s1 = "leetcode";
        String s2 = "catsandog";
        String s3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";

        String[] dict1 = new String[] {"leet","code"};
        String[] dict2 = new String[] {"cats","dog","sand","and","cat"};
        String[] dict3 = new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"};

        HashMap<String, Boolean> memo1 = new HashMap<>();
        HashMap<String, Boolean> memo2 = new HashMap<>();
        HashMap<String, Boolean> memo3 = new HashMap<>();

        boolean ans1 = wordBreak(s1,dict1,memo1);
        boolean ans2 = wordBreak(s2,dict2,memo2);
        boolean ans3 = wordBreak(s3,dict3,memo3);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);

    }

    public static boolean wordBreak(String s, String[] wordDict, HashMap<String, Boolean> memo){

        if(memo.containsKey(s))
            return memo.get(s);

        if(s.length()==0)
            return true;

        for(String word: wordDict){

            if(s.startsWith(word)){
                String suffix = s.substring(word.length());
                if(wordBreak(suffix, wordDict, memo)==true){
                    memo.put(s,true);
                    return true;
                }
            }
        }

        memo.put(s,false);
        return false;

    }
}
