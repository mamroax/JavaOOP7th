public class OldPoint {

    public OldPoint(){}
    public OldPoint(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    private Integer x;
    private Integer y;

    public Integer oldGetX() {
        return x;
    }

    @Override
    public String toString() {
        return "OldPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Integer oldGetY(){
        return y;
    }
}
