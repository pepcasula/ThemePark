import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before() {

        dodgems = new Dodgems("Carcrash", 4);
        park = new Park("Fantasy Park", 2);
        playground = new Playground("Baby Zoo", 3);
        rollerCoaster = new RollerCoaster("Train to Hell", 5);
        candyflossStall = new CandyflossStall("Aunt Candy Shop", "Clara Saints", ParkingSpot.B1, 4);
        iceCreamStall = new IceCreamStall("Gelatoni", "Nanni Moretti", ParkingSpot.A3, 5);
        tobaccoStall = new TobaccoStall("Black Lung Place", "Joseph Pinkerton", ParkingSpot.B2, 2);

        themePark = new ThemePark("Crazyland", dodgems, park, playground, rollerCoaster, candyflossStall, iceCreamStall, tobaccoStall);
    }

    @Test
    public void canGetAllReviewed(){
        ArrayList<IReviewed> allReviewedObjects = new ArrayList<>();
        allReviewedObjects.add(dodgems);
        allReviewedObjects.add(park);
        allReviewedObjects.add(playground);
        allReviewedObjects.add(rollerCoaster);
        allReviewedObjects.add(candyflossStall);
        allReviewedObjects.add(iceCreamStall);
        allReviewedObjects.add(tobaccoStall);
        assertEquals(allReviewedObjects, themePark.getAllReviewed());
    }
}
