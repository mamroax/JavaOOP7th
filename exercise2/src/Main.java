/**
 *  * Создайте фабрику для создания разных типов мобильных устройств,
 *  * таких как смартфоны, планшеты и ноутбуки. Каждое устройство
 *  * должно иметь общий интерфейс Device. Создайте методы фабрики
 *  * для создания конкретных устройств.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createDevice("LAptop");
        factory.createDevice("SmartPHone");
        factory.createDevice("Tablet");
    }
}