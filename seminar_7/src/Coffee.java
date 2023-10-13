public class Coffee implements MakeCoffee{
    private Integer temp;
    private String name;
    private Integer volume;

    public Coffee(Integer temp, String name, Integer volume) {
        this.temp = temp;
        this.name = name;
        this.volume = volume;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public void makeCoffee() {
        System.out.println("Ваш кофе " + name + " объемом " + volume + " готов!");
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "temp=" + temp +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
