package shapes;

public class Rectangle {

    private int length;
    private int height;
    public int perimeter;
    public int area;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getArea(){
        return this.length * this.height;
    }

    public int getPerimeter(){
        return this.length * 2 + this.height * 2;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
