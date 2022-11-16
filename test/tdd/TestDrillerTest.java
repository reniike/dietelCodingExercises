package tdd;

import chapterFour.TestDriller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

    @Test
    public void testForPriceRangeOfOneToFourCopies(){
        TestDriller testDriller = new TestDriller();
        int price = testDriller.getPriceRange(1);
        assertEquals(2000, price);
    }

    @Test
    public void testForPriceRangeOfFiveToNineCopies(){
        TestDriller testDriller = new TestDriller();
        int price = testDriller.getPriceRange(6);
        assertEquals(10_800, price);
    }
    @Test
    public void testForPriceRangeOfTenToTwentyNineCopies(){
        TestDriller testDriller = new TestDriller();
        int price = testDriller.getPriceRange(10);
        assertEquals(16_000, price);
    }
    @Test
    public void testForPriceRangeOfThirtyToFortyNine(){
        TestDriller testDriller = new TestDriller();
        int price = testDriller.getPriceRange(34);
        assertEquals(51_000, price);
    }
    @Test
    public void testForPriceRangeOfFiftyToNinetyNine(){
        TestDriller testDriller = new TestDriller();
        int price = testDriller.getPriceRange(50);
        assertEquals(65_000, price);
    }
    @Test
    public void testForPriceRangeHundredToOneHundredAndNinetyNine(){
        TestDriller testDriller = new TestDriller();
        int price= testDriller.getPriceRange(144);
        assertEquals(172_800, price);
    }
    @Test
    public void testForPriceRangeTwoHundredToFourHundredAndNinetyNine(){
        TestDriller testDriller = new TestDriller();
        int price = testDriller.getPriceRange(201);
        assertEquals(221_100, price);
    }
    @Test
    public void testForPriceRangeFveHundredAndAbove(){
        TestDriller testDriller = new TestDriller();
        int price = testDriller.getPriceRange(560);
        assertEquals(560_000, price);
    }
}
