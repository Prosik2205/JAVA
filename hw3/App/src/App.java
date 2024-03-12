import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> arrayList = new ArrayList<>();
         arrayList.add(1);
         arrayList.add(2);
         arrayList.add(3);
         arrayList.add(4);
         arrayList.add(5);
         arrayList.add(6);
       
        Collections.shuffle(arrayList);
       
        System.out.println("Перемiшаний список: " + arrayList);

        
        Map<String, Integer> map = new HashMap<>();
         map.put("A", 1);
         map.put("B", 2);
         map.put("C", 3);
         map.put("D", 4);

        System.out.println("Значення ключа C : " + map.get("C"));


        List<Integer> linkedList = new LinkedList<>();
         linkedList.add(4);
         linkedList.add(2);
         linkedList.add(4);
         linkedList.add(4);
         linkedList.add(6);
         linkedList.add(10);

        System.out.println("Перше входження елемента '4': " + linkedList.indexOf(4));
        System.out.println("Останнє входження елемента '4': " + linkedList.lastIndexOf(4));
        
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3) ;
        set1.add(4);
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(1);
        set2.add(8);
        set2.add(4);

        if(set1.equals(set2)){
            System.out.println("Набори однаковi");
        }
        else{
            System.out.println("Набори рiзнi");
        }

        

        





        











        
    }
}
