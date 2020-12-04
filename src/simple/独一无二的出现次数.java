package simple;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 独一无二的出现次数 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,4};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr)
            //getOrDefault(Object key,V defaultValue)当Map集合中有这个key时，就使用这个key值;如果没有就使用默认值defaultValue
            map.put(i, map.getOrDefault(i, 0) + 1);

        //map.values()获取map集合中所有的value的值
        return map.size() == new HashSet<Integer>(map.values()).size();
    }
}
