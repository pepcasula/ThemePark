package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double startingPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.startingPrice = 4.50;
    }

    @Override
    public double defaultPrice() {
        return this.startingPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double priceToPay = defaultPrice();
        if (visitor.getAge() < 12){
            priceToPay = defaultPrice() / 2;
        } else {
            priceToPay = defaultPrice();
        }
        return priceToPay;
    }
}
