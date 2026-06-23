import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordReader {

        public static HashMap<String,Integer> readFile(String path) {
            HashMap<String,Integer> map = new HashMap<>();
            try(BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while((line = br.readLine()) != null){
                    String[] words = line.toLowerCase().split("[^a-zA-Z]+");

                    for(String word : words){
                        if(word.isEmpty())
                            continue;
                        if(!map.containsKey(word))
                            map.put(word,1);
                        else
                            map.put(word,map.get(word)+1);
                    }
                }
                return map;
                //System.out.println("Read File Failed. Program will exit now");
                //System.exit(0);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error reading file");
        }
            return null;
    }
}
