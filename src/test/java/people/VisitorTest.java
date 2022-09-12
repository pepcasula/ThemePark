package people;

import attractions.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    ArrayList<Attraction> visitedAttractions;


    @Before
    public void before(){

        visitor = new Visitor(14, 1.2, 40.0, visitedAttractions);

        dodgems = new Dodgems("Carcrash", 4);
        park = new Park("Fantasy Park", 2);
        playground = new Playground("Baby Zoo", 3);
        rollerCoaster = new RollerCoaster("Train to Hell", 5);

        visitedAttractions.add(rollerCoaster);

    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddAttractionToVisited(){
        visitor.addAttractionToVisited(dodgems);
        assertEquals(2, visitedAttractions.size());

    }
}
