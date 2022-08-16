import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> knownWords = new ArrayList<>();
        List<String> textToCheck = new ArrayList<>();
        Set<String> unknownWords = new HashSet<>();
        Scanner console = new Scanner(System.in);
        int numberOfLines;
        int numberOfKnownWords;

//        System.out.println("Enter the number of words from the list of known words");
//        numberOfKnownWords = console.nextInt();
//        System.out.println("Enter each word from the list of known words");
//        for (int i = 0; i < numberOfKnownWords; i++) {
//            knownWords.add(console.next());
//        }

//        System.out.println("Enter the number of lines of the text to be checked");
//        numberOfLines = console.nextInt();
//        System.out.println("Enter the lines of text to be checked");
//        for (int i = 0; i < numberOfLines; i++) {
//            textToCheck.add(console.next());
//        }

        numberOfKnownWords=3;
        knownWords.add("a");
        knownWords.add("bb");
        knownWords.add("cCc");

        numberOfLines = 2;
        textToCheck.add("a bb aab aba");
        textToCheck.add("ccc c bb aaa");

        SpellChecker spellChecker = new SpellChecker(knownWords, textToCheck, unknownWords, numberOfKnownWords, numberOfLines);
        spellChecker.checkTheText();
        for (String unknownWord : unknownWords) {
            System.out.println(unknownWord);
        }

    }
}

