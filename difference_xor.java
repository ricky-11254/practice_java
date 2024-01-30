class Solution {
    public char findTheDifference(String s, String t) {
        if (t.length() == s.length() + 1 && s.length() >= 0 && s.length()<= 1000){
            char c = 0;
            for(char cs: s.toCharArray()) c ^= cs;
            for(char ct: t.toCharArray()) c ^= ct;
            return c;
        }
        else{
            return 0;
        }
    }
}