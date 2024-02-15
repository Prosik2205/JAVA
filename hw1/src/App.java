import java.util.logging.Logger;

import com.sun.tools.javac.Main;

public class App {
   public static void main(String[] args) throws Exception
    {
        Music_Tour m = new Music_Tour("Stepan","Giga");
        Travel t1 = new Travel("Ternopil",1985,5);
        Travel t2 = new Travel("Dnipro",1999,10);

        m.travels.add(t1);
        m.travels.add(t2);
        for (Travel travel: m.travels) {
            System.out.println(travel.get_city());
        }
       
    

        
      
        



    }
}
