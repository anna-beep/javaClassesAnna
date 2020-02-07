public class Rect {
    private double length;
    private double width;

    public Rect (double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width*length;
    }
    public double getDiagonal() {
        double diagonal = Math.sqrt((width*width) + (length*length));
        return diagonal;
    }
    public boolean isSquare() {
        boolean ans = false;
        if (length == width){
            ans = true;
        }
        return ans;
    }
}
