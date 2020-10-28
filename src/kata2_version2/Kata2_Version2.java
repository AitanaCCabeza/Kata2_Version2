package kata2_version2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2_Version2 {

    public static void main(String[] args) {
        
        int [] data = {1, 2, 9, 8, 6, 3, 7, 1, 8, 1, 2, 7, 8, 6, 7};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<data.length; i++){
            histogram.put(data[i], histogram.containsKey(data[i]) ? histogram.get(data[i]) + 1 : 1);
        }
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        } 
    }
    
}
