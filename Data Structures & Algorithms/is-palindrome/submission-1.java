class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> array = s.chars().mapToObj(c -> (char)c)
        .filter(c -> isAlphaNumerix(c)).toList();
        System.out.println(array);
        int i = 0;
        int j = array.size()-1;
        while(i<=j){
            if(array.get(i) != array.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isAlphaNumerix(char c){
        if((('A' <= c) && (c <= 'Z')) || (('a' <= c) && (c<= 'z')) || (('0' <= c) && (c <= '9'))){
            return true;
        }
        return false;
    }
}
