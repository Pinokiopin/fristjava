package firstdz;

public class Point {
    public int x;
    public int y;
    public Point
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int setX(int x){
        this.x = x;
    }
    public int setY(int y){
        this.y = y;
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX()))
    }
}
