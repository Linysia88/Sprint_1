package service;
import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] products;
    public ShoppingCart (Food[] products){
        this.products = products;
    }
    public double getPriceWithoutDiscount(){
        double sum = 0;
        for(int i = 0; i < products.length; i++) {
            sum = sum +
                    products[i].getAmount()
                            * products[i].getPrice();
        }
            return sum;

    }
    public double getPriceWithDiscount() {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            double productPrice = products[i].getAmount() * products[i].getPrice();
            double discount = products[i].getDiscount();
            productPrice = productPrice - (productPrice * discount / 100);
            sum = sum + productPrice;
        }
        return sum;
    }
    public double getVegetarianPrice(){
        double sum = 0;
        for (int i = 0; i< products.length; i++){
            if (products[i].isVegetarian()){
                sum = sum + products[i].getAmount() * products[i].getPrice();
            }
        }
        return sum;
    }
        }
