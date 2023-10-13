public class Smartphone implements Device{
    Smartphone(){
        createDevice();
    }
    @Override
    public void createDevice() {
        System.out.println("Смартфон создан");
    }
}
