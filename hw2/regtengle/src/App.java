import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        
        Paralellogram p = new Paralellogram(5, 6, 45);
        System.out.println(p.getPerimeter());

     
        Trapezium t = new Trapezium(2, 3, 2);
        System.out.println(t.getPerimeter());
    }
}