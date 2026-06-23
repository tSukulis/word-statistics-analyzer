import java.util.HashMap;
import java.util.Map;

public class StatisticsPrinter {

    public static void display(Map<String,Integer> map, Statistics stat){
        System.out.println("Total words: " + stat.getTotalWords());
        System.out.println();
        System.out.println("Most Frequent word: " + stat.getMostFrequentWord() + " " + stat.getMostFrequentWordAppearances());
        System.out.println();
        System.out.println("Unique words: " + stat.getNumOfUniqueWords());
        for(String word : stat.getUniqueWords())
            System.out.println(word);
        System.out.println();
        wordFrequencies(map);
    }

    public static void wordFrequencies(Map<String,Integer> map){
        System.out.println("Word frequencies: ");
        for(String word : map.keySet()){
            System.out.print(word + ": ");
            System.out.println(map.get(word));
        }
    }
}
