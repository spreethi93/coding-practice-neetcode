class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(j > i) {
            while(i < j && !alphaNum(s.charAt(i))){
                i++;
            }
            while(j > i && !alphaNum(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i = i + 1;
            j = j - 1;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
