import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

class WordFrequencyDemo {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("usage: WordFrequencyDemo filename.txt");
            return;
        }
        String filename = args[0];

        try {
            HashMap<String, Integer> frequencyMap = WordFrequency.getFrequencyMap(new FileInputStream(filename));
            System.out.println(frequencyMap);
        }
        catch (IOException exc) {
            System.out.println(exc);
            return;
        }
    }
}