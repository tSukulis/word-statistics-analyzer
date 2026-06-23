import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String path = "/home/valefar/IdeaProjects/Word Statistics Analyzer/data.txt";
        Map<String,Integer> map = WordReader.readFile(path);
        Statistics stats = new Statistics();
        stats.analyzeWords(map);
        StatisticsPrinter.display(map, stats);




    }



}
