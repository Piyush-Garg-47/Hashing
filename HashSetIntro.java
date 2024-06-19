import java.util.*;
public class HashSetIntro {
    public static void main(String[] args) {
     HashSet<Integer> set= new HashSet<>() ;
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(4);
     set.add(2);
     set.add(1);

     System.out.println(set);
     System.out.println(set.size());
      set.remove(3);
     if(set.contains(3)){
        System.out.println(" yes ! set contains 3 ");
     }else{
        System.out.println(" No ! set contains 3 ");
     }
    }
}
