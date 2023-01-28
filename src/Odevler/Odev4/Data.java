package Odevler.Odev4;

public abstract class Data {

    private int radius;
    private int length;
    private int width;
    final double pi=3.14;



    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    public  abstract double getArea();


}
