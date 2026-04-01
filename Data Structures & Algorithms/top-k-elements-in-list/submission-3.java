class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new LinkedHashMap<>();
       for(int i = 0;i < nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       //System.out.println(map);
       //Collections.sort(map);
       map = map.entrySet().stream()
       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
       collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue, newValue) -> oldValue,LinkedHashMap::new));
       //System.out.println(linkedMap);
       int[] result = new int[k];
       int i = 0;
       for(Integer key : map.keySet()){
        if(i == k){
            break;
        }else{
            result[i] = key;
            i++;
        }
       }
       return result; 
    }
}
