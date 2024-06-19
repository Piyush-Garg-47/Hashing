import java.util.*;
public class IteratorSet {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add(" lucknoe ");
        cities.add(" delhi ");
        cities.add(" noida ");
        cities.add(" gorgaon");
    //   Iterator it = cities.iterator();
    //   while(it.hasNext()){
    //     System.out.println(it.next());
    //   }
    for (String city : cities) {
        System.out.println(city);
    }
}
}
