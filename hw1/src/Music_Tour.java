import java.util.List;

public class Music_Tour
{
    private String name;
    private String sname_BOSS;

    public List<Travel> travels = new List<>();
        
    Music_Tour(String name, String sname_BOSS)
    {
        this.name = name;
        this.sname_BOSS = sname_BOSS;
    }

    public String get_name()
    {
        return name;

    }

    public String get_sname_BOSS()
    {
        return sname_BOSS;

    }

    

   
}


class Travel 
{
   private String city;
   private int year;
   private int count_concert;

   Travel(String city,int year,int count_concert)
   {
    this.city = city;
    this.year = year;
    this.count_concert = count_concert;
   }

   public String get_city()
    {
        return city;
    }

    public int get_year()
    {
        return year;
    }

    public int get_count_concert()
    {
        return count_concert;
    }
    
    
}
