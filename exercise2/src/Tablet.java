public class Tablet implements Device{

    Tablet(){
        createDevice();
    }
    @Override
    public void createDevice() {
        System.out.println("Планшет создан");
    }
}
