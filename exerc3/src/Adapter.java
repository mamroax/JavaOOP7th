public class Adapter implements NewPoint{
    private OldPoint oldPoint;
    Adapter(OldPoint oldPoint){
        this.oldPoint = oldPoint;
    }

    @Override
    public Integer newGetX() {
        return oldPoint.oldGetX();
    }


    public Integer newGetY() {
        return oldPoint.oldGetY();
    }

    @Override
    public String toString() {
        return "Adapter{" + oldPoint +
                '}';
    }
}
