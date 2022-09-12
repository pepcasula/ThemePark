package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double startingPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.startingPrice = 8.40;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean isAllowed = false;
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 146) {
            isAllowed = true;
        } else {
            isAllowed = false;
        }
        return isAllowed;
    }

    @Override
    public double defaultPrice() {
        return this.startingPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double priceToPay = defaultPrice();
        if(visitor.getHeight() > 200.00){
            priceToPay *= 2;
        } else {
            priceToPay = defaultPrice();
        }
        return priceToPay;
    }
}
