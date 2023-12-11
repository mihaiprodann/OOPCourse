package ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderr {
    public List<String> readFiles(String directoryPath) {
        List<String> texts = new ArrayList<>();

        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        texts.add(readFile(file));
                    }
                }
            }
        }
        return texts;
    }

    private String readFile(File file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
