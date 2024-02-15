import java.util.logging.Logger;

import com.sun.tools.javac.Main;

import java.util.List;

public class App {
   public static void main(String[] args) throws Exception
    {
      
        Travel t1 = new Travel("Ternopil",1985,50);
        Travel t2 = new Travel("Dnipro",1999,10);
        List<Travel> u = List.of(t1,t2);
        Music_Tour m = new Music_Tour("Stepan","Giga",u);
        m.getMaxTravel();
       
    

        
      
        



    }
}
