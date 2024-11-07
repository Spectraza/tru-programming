import java.util.Locale;
import java.util.ArrayList;
import java.util.Arrays;

//Valeriia Savych
//TRU ID: T00739110

public class MessageProcessor {
    private String message;
    private String upperCase;
    private String lowerCase;
    private int WordCount;
    private String[] reverseMessage;

    public MessageProcessor(String message) {

    }

    public void setUpperCase(String upperCase) {
        this.upperCase = upperCase.toUpperCase(Locale.ROOT);
    }

    public void setLowerCase(String lowerCase) {
        this.lowerCase = lowerCase.toLowerCase(Locale.ROOT);
    }

    public void setWordCount(int WordCount) {
        this.WordCount = WordCount;
    }

    public void setReverseMessage(String reverseMessage) {
        this.reverseMessage = " ".split(message);
        for (int i = 0; i < reverseMessage.length(); i++) {
            if (i == reverseMessage.length() - 1) {
                message = reverseMessage + message;
            }
            else {
                reverseMessage = " " + reverseMessage + " ";
            }

        }

    }

    public String getUpperCase() {
        return upperCase;
    }

    public String getLowerCase() {
        return lowerCase;
    }

    public int getWordCount() {
        return WordCount;
    }

    public String[] getReverseMessage() {
        return reverseMessage;
    }
}
