package models;

public class Point {
    private double x;
    private double y;
    // constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // calculate distance between two points
    // dest point is outer point
    public double distance(Point dest) {
        double dx = this.x - dest.x;
        double dy = this.y - dest.y;

        return Math.sqrt(dx * dx + dy * dy);
    }
    // rewrite string as we want
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}