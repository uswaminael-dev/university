package Lab05Task3;

public class Length {
    private Point startPoint;
    private Point endPoint;

    // constructors
    public Length() {
        this.startPoint = new Point();
        this.endPoint = new Point();
    }

    public Length(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // getters
    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    // setters
    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    // instance methods
    public double calculateLength() {
        if (startPoint == null || endPoint == null) {
            return 0;
        }
        int dx = endPoint.getX() - startPoint.getX();
        int dy = endPoint.getY() - startPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void display() {
        System.out.println("Start point: (" + startPoint.getX() + ", " + startPoint.getY() + ")");
        System.out.println("End point: (" + endPoint.getX() + ", " + endPoint.getY() + ")");
        System.out.println("Length: " + calculateLength());
    }
}
