package tasks.collections;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        String input = "hello";
        Map<Character, Integer> freqMap = new HashMap<>();

        // Convert string to character array
        for (char ch : input.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        // Print frequency map
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

