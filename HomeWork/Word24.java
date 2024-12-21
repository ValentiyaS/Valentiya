package HomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Word24 {

    public static void main(String[] args) {
        String fileName = "./src/resources/words.txt";
        try {
            List<String> words = readWordsFromFile(fileName);
            Map<String, Integer> wordCount = countWordFrequency(words);
            printWordStatistics(wordCount);
            findMaxFrequencyWords(wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Считывание содержимого файла и разбиение текста на слова
    private static List<String> readWordsFromFile(String fileName) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(fileName)));
        // Разделяем текст на слова, игнорируя пробелы, знаки препинания и цифры
        String[] words = content.split("[^a-zA-Zа-яА-Я]+"); // Только буквы (латиница и кириллица)
        return Arrays.asList(words);
    }

    // Подсчет частоты вхождения слов
   private static Map<String, Integer> countWordFrequency(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
              if (!word.isEmpty()) {
                word = word.toLowerCase(); // Приведение к нижнему регистру
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }

    // Вывод статистики: слово, частота, процент
    private static void printWordStatistics(Map<String, Integer> wordCount) {
        // Подсчет общего числа слов
        int totalWords = wordCount.values().stream().mapToInt(Integer::intValue).sum();

        // Сортировка слов в алфавитном порядке
        List<String> sortedWords = new ArrayList<>(wordCount.keySet());
        Collections.sort(sortedWords);

        System.out.println("Слово | Частота | Процент вхождения");
        System.out.println("-----------------------------------");
        for (String word : sortedWords) {
            int count = wordCount.get(word);
            double percentage = (count * 100.0) / totalWords; // Расчет процента
            System.out.printf("%-10s | %-8d | %.2f%%%n", word, count, percentage);
        }
    }

    // Нахождение слов с максимальной частотой и их вывод
    private static void findMaxFrequencyWords(Map<String, Integer> wordCount) {
        int maxFrequency = Collections.max(wordCount.values());
        List<String> maxWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxWords.add(entry.getKey());
            }
        }

        System.out.println("\nСлово с максимальной частотой:");
        for (String word : maxWords) {
            System.out.println(word + ": " + maxFrequency);
        }
    }
}
