package first_unique_character_in_a_string;

import java.util.*;

public class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
