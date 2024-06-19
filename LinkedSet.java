import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedSet {
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
    }
}
