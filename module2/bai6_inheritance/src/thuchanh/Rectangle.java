package thuchanh;

public class Rectangle extends Shape {
    private int width=10;
    private int length=15;

    public Rectangle() {

    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, boolean filled, int width, int length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int dienTich(int length,int width){
        int s=length*width;
        return s;
    }
    public int chuVi(int length,int width){
        int s=(length+width)*2;
        return s;
    }

    @Override
    public String toString() {
        return "Rectangle" +
                " width=" + width +
                ", length=" + length +", "+
                super.toString() +
                ", diện tích="+dienTich(width,length)
                +
                ", chu vi="+chuVi(width,length);
    }

    public static void main(String[] args) {
        Shape rectangle1=new Rectangle("blue",false,5,5);
        System.out.println(rectangle1);
    }
}
