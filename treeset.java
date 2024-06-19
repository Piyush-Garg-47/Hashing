import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class treeset {
  public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("lucknow");
        cities.add("delhi");
        cities.add("noida");
        cities.add("gurgaon");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("lucknow");
        lhs.add("delhi");
        lhs.add("noida");
        lhs.add("gurgaon");

        System.out.println(lhs);
        TreeSet<String>ts = new TreeSet<>();

       ts.add("lucknow");
        ts.add("delhi");
        ts.add("noida");
        ts.add("gurgaon");
         
        System.out.println( ts );
    }  
}
