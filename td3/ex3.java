class Point {
    private double x, y;
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    static double distance(Point p1, Point p2) {
        double d;
        d = Math.sqrt(Math.pow((p1.x - p2.x), 2.0) + Math.pow((p1.y - p2.y), 2.0));
        return d;
    }
    
    void affiche() {
        System.out.println("p = (" + x + " , " + y + ")");
    }
}

class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 3.0);
        Point p2 = new Point(5.0, 6.0);
        double d = Point.distance(p1, p2);
        p1.affiche();
        p2.affiche();
        System.out.println("Distance entre p1 et p2 = " + d);
    }
}