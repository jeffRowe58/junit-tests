import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {
    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected,actual);
    }

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.00;
        Double discount = 4.5;

        assertEquals(5.5, price - discount,0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent(){
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

//    @Test
//    public void testIfInstanceIsNull() {
//        Device phone = new Device();
//        Device laptop = null;
//        assertNull(null);
//        assertNotNull(phone);
//    }

    private List<String> names;

    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer");
    }

    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
//        assertSame("fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }
    @Test
    public void isCodupEqualCodeup(){
        String correct = "Codeup";
        String incorrect = "CodeUp";

        assertNotEquals(correct, incorrect);
    }

    @Test
    public void ArraysEqual(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void arrayAgain(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void booYou(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement


    }

}
