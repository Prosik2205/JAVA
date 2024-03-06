public class Trapezium extends Perimetr {
    private float c;
    private float d;
    private float h;

    public Trapezium(float c, float d, float h) {
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public float getPerimeter() {
        return this.c + this.d + 2 * (float) (Math.pow((Math.pow(this.c - this.d, 2) + Math.pow(this.h, 2)), 0.5));
    }
}
