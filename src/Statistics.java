import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Statistics {
    private int totalWords;
    private int numOfUniqueWords;
    private String mostFrequentWord;
    private int mostFrequentWordAppearances;
    private ArrayList<String> uniqueWords;

    public int getTotalWords() {
        return totalWords;
    }

    public int getNumOfUniqueWords() {
        return numOfUniqueWords;
    }

    public String getMostFrequentWord() {
        return mostFrequentWord;
    }

    public int getMostFrequentWordAppearances() {
        return mostFrequentWordAppearances;
    }

    public ArrayList<String> getUniqueWords() {
        return uniqueWords;
    }

    public Statistics(){
        this.totalWords = 0;
        this.numOfUniqueWords = 0;
        this.mostFrequentWord = "";
        this.mostFrequentWordAppearances = 0;
        this.uniqueWords = new ArrayList<>();
    }





    public void calculateTotalWords(Map<String,Integer> map){
        totalWords = 0;
        for(String word: map.keySet()) {
            totalWords += map.get(word);
        }
    }

    public void calculateUniqueWords(Map<String,Integer> map){
        uniqueWords.clear();
        numOfUniqueWords = 0;
        for(String word : map.keySet()) {
            if(map.get(word)==1) {
                uniqueWords.add(word);
                numOfUniqueWords++;
            }
        }
    }


    public  void calculateMostFrequentWord(Map<String,Integer> map){
        int max = 0;
        for(String word : map.keySet()) {
            if(map.get(word) > max){
                max = map.get(word);
                mostFrequentWord = word;
            }
        }
        mostFrequentWordAppearances = max;
    }

    public void analyzeWords(Map<String,Integer> map){
        calculateTotalWords(map);
        calculateUniqueWords(map);
        calculateMostFrequentWord(map);
    }






}
