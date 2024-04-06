package MVC;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Rectangle rect0 = new Rectangle(1,1,2,2);
        Rectangle rect1 = new Rectangle(1,1,2,3);
        Rectangle rect2 = new Rectangle(0,0,1,1);

        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(rect0);
        rectangleList.add(rect1);
        rectangleList.add(rect2);
        RectangleIntersection.convertListToRectanglesPair(rectangleList);
    }
}
class Rectangle {
    int ax, ay, bx, by;
    Rectangle(int a, int b, int c, int d){
        ax = a;
        ay = b;
        bx = c;
        by = d;
    }
}
class RectangleIntersection {
    static void convertListToRectanglesPair(ArrayList<Rectangle> rectangleList) {
        for (int r1 = 0; r1 < rectangleList.size(); r1++) {
            for (int r2 = r1 + 1; r2 < rectangleList.size(); r2++) {
                System.out.print(r1 + " with " + r2 + ": ");
                solwer(rectangleList.get(r1), rectangleList.get(r2));
                System.out.println();
            }
        }
    }
    static void solwer(Rectangle r1, Rectangle r2) {
        if(r2.ax > r1.bx || r1.ax > r2.bx || r1.ay > r2.by || r2.ay > r1.by) {
            System.out.print("there is no intersection");
        }else if(((r2.ay == r1.by || r1.ay == r2.by) && r1.ax == r2.bx)||((r2.ay == r1.by || r1.ay == r2.by))&& r2.ax == r1.bx){
            System.out.print("the intersection is a point");
        }else if(r1.ax == r2.bx || r2.ax == r1.bx) {
            System.out.print("the intersection is a vertical line");
        }else if(r1.ay == r2.by || r2.ay == r1.by) {
            System.out.print("the intersection is a horizontal line");
        }else {
            System.out.print("the cross section is a rectangle");
        }

    }
}
