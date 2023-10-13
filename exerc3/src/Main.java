/**
 * У вас есть сторонний класс OldLibrary, который предоставляет функциональность
 * для работы с OldPoint (старая структура данных). Создайте адаптер,
 * который позволит использовать OldLibrary с вашей новой системой,
 * используя NewPoint (новая структура данных). Адаптер должен конвертировать
 * NewPoint в OldPoint для вызова методов OldLibrary.
 *
 * Шаги:
 *
 * Создайте класс OldPoint с методами oldGetX() и oldGetY(). ++
 *
 * Создайте интерфейс NewPoint с методами newGetX() и newGetY(). +
 *
 * Создайте адаптер, который реализует интерфейс NewPoint и принимает
 * объект OldPoint. Методы newGetX() и newGetY() адаптера должны использовать
 * oldGetX() и oldGetY() объекта OldPoint.
 *
 * Создайте клиентский код, который использует адаптер для работы с OldLibrary,
 * преобразуя NewPoint в OldPoint.*/
public class Main {
    public static void main(String[] args) {
        OldPoint oldPoint = new OldPoint(10, 20);
        NewPoint adaptedPoint = new Adapter(oldPoint);
        System.out.println(adaptedPoint);
    }
}
