import java.util .*;

public class Iterate {
    public static void main(String[] args) {
          HashMap<String , Integer> hm = new HashMap<>() ;
        hm.put("india" , 120) ; 
        hm.put("china", 150);
        hm.put("us", 150) ; 
        hm.put("australia", 130);
        hm.put("indonesia", 140);
        Set <String> keys = hm.keySet() ; 
        System.out.println(keys);
        for (String k : keys) {
            System.out.println( "key = "+k + " , value = "+hm.get(k));
        }
    }
}
