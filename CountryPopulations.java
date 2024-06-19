import java.util.TreeMap;

public class CountryPopulations {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 140);
        tm.put("China", 170);
        tm.put("US", 100);
        
        System.out.println(tm);
    }
}


