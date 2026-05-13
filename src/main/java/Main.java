import model.Apple;
import model.Meat;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5, 100);
        Apple apple1 = new Apple(10, 50, Colour.RED);
        Apple apple2 = new Apple(8, 60, Colour.GREEN);
        Food[] products = {meat, apple1, apple2};
        ShoppingCart cart = new ShoppingCart(products);
        System.out.println("Общая сумма товаров без скидки " + cart.getPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой " + cart.getPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских товаров " + cart.getVegetarianPrice());
    }
}
