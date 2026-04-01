class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = sortedString(s);
        String s2 = sortedString(t);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }

    public static String sortedString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
