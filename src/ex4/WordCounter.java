package ex4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    public Map<String, Integer> countWords(List<String> texts) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < texts.size(); i++) {
            String[] words = texts.get(i).split("\\s+"); // separ in cuvinte

            for (int j = 0; j < words.length; j++) { //
                String word = words[j].replaceAll("[^a-zA-Z]", "").toLowerCase(); // sterge cuvantul
                if (!word.isEmpty()) {
                    int count = wordCount.getOrDefault(word, 0); // nr de aparitii
                    wordCount.put(word, count + 1);
                }
            }
        }
        return wordCount;
    }
}
