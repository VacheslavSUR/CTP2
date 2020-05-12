public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {//конструктор инциализации
        xCoord = x;
        yCoord = y;
        zCoord = z;
        }
public Point3d() {
        this(0.0,0.0,0.0);
        }

public double getX() {
        return xCoord;
        }
public double getY() {
        return yCoord;
        }
public double getZ() { return zCoord; }

public void setX(double value) {xCoord = value; }
public void setY(double value) {
        yCoord = value;
        }
public void setZ(double value) { zCoord = value; }

public boolean Equals(Point3d b) {//функция проверки равенства
        return (this.xCoord == b.xCoord && this.yCoord == b.yCoord && this.zCoord == b.zCoord);
        }
public double distanceTo(Point3d b) {//функция вычисления расстояние
        double res = Math.sqrt(Math.pow(b.getX()-this.getX(),2)+Math.pow(b.getY()-this.getY(),2)+Math.pow(b.getZ()-this.getZ(),2));
        return res;
        }
        }
