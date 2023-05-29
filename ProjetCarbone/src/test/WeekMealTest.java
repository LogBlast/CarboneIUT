package test;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import iutcarbone.Model.WeekMeal;

public class WeekMealTest {

    private static WeekMeal weekMeal;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        weekMeal = new WeekMeal();
    }

    @Before
    public void setUp() throws Exception {
        weekMeal.init();
    }
 
    @Test
    public void testAddExistingMealWithCorrectQuantity() {
        weekMeal.addMeal(WeekMeal.Meal.VEGAN, 2);
        assertEquals(2, weekMeal.getNbVegan(), 0.0);
    }

    @Test
    public void testAddExistingMealWithNegativeQuantity() {
        assertThrows(IllegalArgumentException.class, () -> {
            weekMeal.addMeal(WeekMeal.Meal.VEGAN, -2);
        });
    }
    
}
