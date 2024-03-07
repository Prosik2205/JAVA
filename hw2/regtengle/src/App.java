import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        // var p =(Perimetr) new Paralellogram(5, 6, 45);
        
        Paralellogram p = new Paralellogram(5, 6, 45);
        System.out.println("Perimeter paralelogram: "+p.getPerimeter());

     
        Trapezium t = new Trapezium(8, 10, 30);
        System.out.println("Perimeter trapezium: "+t.getPerimeter());
    }
}
