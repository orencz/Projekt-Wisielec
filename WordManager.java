import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class WordManager {
    private ArrayList<String> words;

    public WordManager() {
        words = new ArrayList<>();
        loadWords();
    }

    public void loadWords() {
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveWords() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("words.txt"))) {
            for (String word : words) {
                bw.write(word);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addWord(String word) {
        words.add(word);
        saveWords();
    }

    public void removeWord(String word) {
        words.remove(word);
        saveWords();
    }

    public String getRandomWord(String difficulty) {
        Random random = new Random();
        ArrayList<String> filteredWords = new ArrayList<>();
        int length = difficulty.equals("easy") ? 4 : difficulty.equals("medium") ? 6 : 8;

        for (String word : words) {
            if (word.length() >= length) {
                filteredWords.add(word);
            }
        }

        return filteredWords.get(random.nextInt(filteredWords.size()));
    }
}
