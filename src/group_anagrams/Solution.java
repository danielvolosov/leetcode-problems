package group_anagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List> result = new HashMap<>();

        if (strs.length == 0) {
            return new ArrayList<>();
        }

        for (String str : strs) {
            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String key = String.valueOf(chars);

            if (!result.containsKey(key)) {
                result.put(key, new ArrayList());
            }

            result.get(key).add(str);
        }

        return new ArrayList(result.values());
    }
}
