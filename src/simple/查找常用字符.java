package simple;

import java.util.ArrayList;
import java.util.List;

public class 查找常用字符 {
    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella", "label", "roller"}));
    }

    public static List<String> commonChars(String[] A){
        int hash[] = new int[26];
        int temp[] = new int[26];
        List<String> list = new ArrayList<>();
        if(A.length == 0) return list;

        // 先统计第一个字符串的各个字符出现的次数到hash数组中
        for (int i = 0; i < A[0].length(); i++) {
            hash[A[0].charAt(i) - 'a']++;
        }

        // 再统计接下里的每个字符串的各个字符出现的次数到temp数组中
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                temp[A[i].charAt(j) - 'a']++;
            }
            // 将两个数组进行比较，取最小值更新到hash数组
            for (int j = 0; j < 26; j++) {
                if(hash[j] > temp[j])
                    hash[j] = temp[j];
                temp[j] = 0;
            }
        }

        // 将数组转为字母对应的字符串，并添加到集合中
        for (int i = 0; i < 26; i++) {
            while(hash[i] > 0) {
                list.add(String.valueOf((char)(i + 'a')));
                hash[i]--;
            }
        }

        return list;
    }
}
