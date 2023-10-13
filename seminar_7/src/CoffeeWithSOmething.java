public class CoffeeWithSOmething implements MakeCoffee{
    private String milk = "Молоко";
    private String chocolate = "Шоколад";
    private Coffee coffee;

    public CoffeeWithSOmething(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public void makeCoffee() {
        System.out.println("Приготовлен кофе "+coffee+" с "+milk+" и с "+ chocolate);
    }
}
