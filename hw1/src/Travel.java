public class Travel {
    
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
