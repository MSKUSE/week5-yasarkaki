public class Rectangle {

    private Point topLeft;
    private int sideA ,sideB;

    public Rectangle(Point topLeft, int sideA , int SideB ) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }

    public Rectangle(Point topLeft, int sideA ){

    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
        if (sideB < 0){
            this.sideB = 0;
            System.out.println("Side B can not be positive");{
                else{
                    this.sideB = sideB;
                }
            }
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    }
    public int perimeter(){
        return (2*sideA) + (2*sideB);
    }

    public int area(){
        return sideA*sideB
    }
}

