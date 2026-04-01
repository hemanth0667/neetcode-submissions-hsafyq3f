class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i < strs.length;i++){
            String sorted = sortedString(strs[i]);
            List<String> assorted = map.getOrDefault(sorted,new ArrayList<>());
            assorted.add(strs[i]);
            map.put(sorted,assorted);
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }

    public static String sortedString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
