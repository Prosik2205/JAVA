import java.util.ArrayList;
import java.util.List;

public class Music_Tour
{
    private String name;
    private String sname_BOSS;
    private List<Travel> travels;
        
    Music_Tour(String name, String sname_BOSS, List<Travel> travels)
    {
        this.name = name;
        this.sname_BOSS = sname_BOSS;
        this.travels = travels;
    }

    public String get_name()
    {
        return name;

    }

    public String get_sname_BOSS()
    {
        return sname_BOSS;
    }

    public void getMaxTravel()
    {
        Travel maxTravel = null;
        for(Travel travel:travels)
        {
            if(maxTravel == null || travel.get_count_concert() > maxTravel.get_count_concert())
            {
                maxTravel = travel;
            }

        }
        System.out.println("City: "  + maxTravel.get_city() + "\nYear: " + maxTravel.get_year() + "\nCount of tours: " + maxTravel.get_count_concert());
        
    }   
}



