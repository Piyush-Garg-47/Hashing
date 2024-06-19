import java.util.*;
public class hashmap{
    public static void main(String[] args) {
        // create 
        HashMap<String , Integer> hm = new HashMap<>() ;
        // insert 
        hm.put("india" , 120) ; 
        hm.put("china", 150);
        hm.put("us", 150) ; 
        System.out.println(hm); 
        // get 
         int population = hm.get("india");
        System.out.println(population);
        System.out.println(hm.get("indonasia"));
         // contains key 
        System.out.println(hm.containsKey("india"));
        
         System.out.println(hm.containsKey("indonasia"));
        // remove 
        System.out.println(hm.remove("china"));
        System.out.println(hm);
        // size 
        System.out.println(hm.size());
        // clear 
         hm.clear();
        // is empty 
        System.out.println(hm.isEmpty());
    }
}