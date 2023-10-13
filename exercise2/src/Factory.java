public class Factory {
    public Device createDevice(String type){
        if (type.equalsIgnoreCase("tablet")){
            return new Tablet();
        }
        else if (type.equalsIgnoreCase("laptop")){
            return new Laptop();
        }
        else if (type.equalsIgnoreCase("smartphone")){
            return new Smartphone();
        }
        else {
            return null;
        }
    }
}
