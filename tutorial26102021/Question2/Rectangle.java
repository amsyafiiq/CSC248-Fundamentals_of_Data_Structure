package Question2;

public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {this.width = width;}
    public void setlength(double length) {this.length = length;}

    public double calcArea() {return width * length;}
    public double getLength() {return length;}
    public double getWidth() {return width;}
    
    public String toString() {
        return ("Width: " + width + "\n"
              + "Length: " + length);
    }
    
}