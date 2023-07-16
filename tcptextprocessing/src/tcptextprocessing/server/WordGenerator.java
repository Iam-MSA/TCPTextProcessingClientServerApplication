package tcptextprocessing.server;

/**
 * This class generates words.
 * 
 * @author Mirza Sahid Afridi
 */
public class WordGenerator {

    /**
     * This method generates the word count.
     * 
     * @return The word count.
     */
    public int getWordCount() {

    	// The Input Words
        String input = "I am generating words for Mirza Sahid Afridi"; 

        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }
}
