package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{
    private String colour;
    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }
    public String getColour(){
        return colour;
    }
    @Override
    public double getDiscount() {

        if (colour == Colour.RED) {
            return Discount.RED_APPLES_DISCOUNT;
        }
        return 0;
    }
}


