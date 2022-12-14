package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    ArrayList<Attraction> visitedAttractions;

    @Before
    public void setUp() {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(16, 162.00, 35.00, visitedAttractions);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorIsAllowed() {
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
