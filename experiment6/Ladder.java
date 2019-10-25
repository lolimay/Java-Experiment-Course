public class Ladder {
    double topWidth, bottomWidth, height, area;

    Ladder(topWidth, bottomWidth, height) {
        // if (topWidth <= 0 || bottomWidth <= 0 || height <= 0) {
        //     throw new Error("Invalid topWidth, bottomWidth or height!");
        // }
        this.topWidth = topWidth;
        this.bottomWidth = bottomWidth;
        this.height = height;
    }

    public String getArea() {
        double area = (this.topWidth + this.bottomWidth) / 2;
        
        return String.valueOf(area);
    }

    public void setTopWidth(int width) {
        this.topWidth = width;
    }

    public void setBottomWidth(width) {
        this.bottomWidth = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}