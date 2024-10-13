package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    double distance(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance(Point point){
        if(point == null){
            System.out.println("null değil");
            return 0;
        }
        return distance(point.x, point.y);
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
}
