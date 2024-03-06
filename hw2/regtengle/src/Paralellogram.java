public class Paralellogram extends Perimetr {
    private float a;
    private float h;
    private float alfa;

    public Paralellogram(float a, float h, float alfa) {
        this.a = a;
        this.h = h;
        this.alfa = alfa;
    }

    public float getPerimeter() {
        return 2 * (this.a + this.h);
    }
}
