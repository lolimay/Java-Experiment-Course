public class Ladder {
    double topWidth, bottomWidth, height, area;

    Ladder(double topWidth, double bottomWidth, double height) {
        if (topWidth <= 0 || bottomWidth <= 0 || height <= 0) {
            throw new Error("Invalid topWidth, bottomWidth or height!");
        }
        this.topWidth = topWidth;
        this.bottomWidth = bottomWidth;
        this.height = height;
    }

    public String getArea() {
        double area = (this.topWidth + this.bottomWidth) / 2;
        
        return String.valueOf(area);
    }

    public void setTopWidth(double width) {
        this.topWidth = width;
    }

    public void setBottomWidth(double width) {
        this.bottomWidth = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}