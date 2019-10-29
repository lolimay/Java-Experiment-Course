public class Trapezia {
    double sideA, sideB, sideC, area;
    boolean isTrapezia;

    public void setA(double a) {
        // TODO Auto-generated method stub
        sideA = a;

    }

    public void setB(double b) {
        // TODO Auto-generated method stub
        sideB = b;
    }

    public void setC(double c) {
        // TODO Auto-generated method stub
        sideC = c;
    }

    public String getArea() {
        // TODO Auto-generated method stub
        area = (sideA + sideB) * sideC / 2.0;
        return String.valueOf(area);
    }

}