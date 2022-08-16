import java.util.List;
import java.util.Set;

public class SpellChecker {
    private List<String> knownWords;
    private List<String> textToCheck;
    private Set<String> unknownWords;
    private int numberOfKnownWords;
    private int numberOfLines;
    private String[] textSplitted;


    public SpellChecker(List<String> knownWords, List<String> textToCheck, Set<String> unknownWords, int numberOfKnownWords, int numberOfLines) {
        this.knownWords = knownWords;
        this.textToCheck = textToCheck;
        this.unknownWords = unknownWords;
        this.numberOfKnownWords = numberOfKnownWords;
        this.numberOfLines = numberOfLines;
    }

    public List<String> getKnownWords() {
        return knownWords;
    }

    public void setKnownWords(List<String> knownWords) {
        this.knownWords = knownWords;
    }

    public List<String> getTextToCheck() {
        return textToCheck;
    }

    public void setTextToCheck(List<String> textToCheck) {
        this.textToCheck = textToCheck;
    }

    public int getNumberOfKnownWords() {
        return numberOfKnownWords;
    }

    public void setNumberOfKnownWords(int numberOfKnownWords) {
        this.numberOfKnownWords = numberOfKnownWords;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public void checkTheText() {
        for (int i = 0; i < numberOfLines; i++) {
            textSplitted = textToCheck.get(i).split(" ");
            for (int j = 0; j < textSplitted.length; j++) {
                if(!isEquals(textSplitted[j], knownWords)){
                    unknownWords.add(textSplitted[j]);
                }
            }
        }
    }

    public boolean isEquals(String word, List<String> knownWord) {
        for (int k = 0; k < numberOfKnownWords; k++) {
            if (word.equalsIgnoreCase(knownWords.get(k))) {
                return true;
            }
        }
        return false;
    }
}


