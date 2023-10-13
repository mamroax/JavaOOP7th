public class Laptop implements Device{

    Laptop(){
        createDevice();
    }
    @Override
    public void createDevice() {
        System.out.println("Ноутбук создан");
    }
}
