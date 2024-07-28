import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InteractiveTextEditor {

    interface TextObserver {
        void update(String misspelledWord);
    }

    static class TextEditor {
        private String text;
        private List<TextObserver> spellCheckers = new ArrayList<>();
        public List<String> dictionary = Arrays.asList("This", "is", "a", "text", "with", "misspelled",
                "word", "hello", "world", "programming", "coding", "example", "software", "dynamic", "input");

        public void addSpellChecker(TextObserver observer) {
            spellCheckers.add(observer);
        }

        public void setText(String newText) {
            this.text = newText;
            checkSpelling();
        }

        private void checkSpelling() {
            for (String word : text.split("\\s+")) {
                if (!isWordInDictionary(word) && !isNumeric(word)) {
                    for (TextObserver observer : spellCheckers) {
                        observer.update(word);
                    }
                }
            }
        }

        private boolean isWordInDictionary(String word) {
            return dictionary.contains(word.toLowerCase());
        }

        private boolean isNumeric(String str) {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    static class ImprovedSpellChecker implements TextObserver {
        private List<String> dictionary;

        public ImprovedSpellChecker(List<String> dictionary) {
            this.dictionary = dictionary;
        }

        @Override
        public void update(String misspelledWord) {
            List<String> suggestions = getSuggestions(misspelledWord, dictionary);
            if (!suggestions.isEmpty()) {
                System.out.println("\n--- Spell Check ---");
                System.out.println("Misspelled: " + misspelledWord);
                System.out.println("Suggestions:");
                for (int i = 0; i < suggestions.size(); i++) {
                    System.out.println((i + 1) + ". " + suggestions.get(i));
                }
                System.out.println("---");
            }
        }

        private List<String> getSuggestions(String word, List<String> dictionary) {
            List<String> suggestions = new ArrayList<>();
            int maxDistance = 2;

            for (String dictWord : dictionary) {
                if (levenshteinDistance(word.toLowerCase(), dictWord.toLowerCase()) <= maxDistance) {
                    suggestions.add(dictWord);
                }
            }
            return suggestions;
        }

        private int levenshteinDistance(String a, String b) {
            // ... (Levenshtein distance implementation - same as before)
            int[][] dp = new int[a.length() + 1][b.length() + 1];
            for (int i = 0; i <= a.length(); i++) {
                dp[i][0] = i;
            }
            for (int j = 0; j <= b.length(); j++) {
                dp[0][j] = j;
            }
            for (int i = 1; i <= a.length(); i++) {
                for (int j = 1; j <= b.length(); j++) {
                    int substitutionCost = (a.charAt(i - 1) == b.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1,
                                    dp[i][j - 1] + 1),
                            dp[i - 1][j - 1] + substitutionCost);
                }
            }
            return dp[a.length()][b.length()];
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        ImprovedSpellChecker spellChecker = new ImprovedSpellChecker(editor.dictionary);
        editor.addSpellChecker(spellChecker);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter text (or 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break; 
            }
            editor.setText(input);
        }
        scanner.close();
    }
}