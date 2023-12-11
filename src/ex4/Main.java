package ex4;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "textFiles";

        FileReaderr fileReader = new FileReaderr();
        List<String> texts = fileReader.readFiles(directoryPath);

        WordCounter wordCounter = new WordCounter();
        Map<String, Integer> wordCount = wordCounter.countWords(texts);

        Set<Entry<String, Integer>> entrySet = wordCount.entrySet();
        Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
        for (int i = 0; i < wordCount.size(); i++) {
            Entry<String, Integer> entry = iterator.next();
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + " -> " + count);
        }
    }
}

