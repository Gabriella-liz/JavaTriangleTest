package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testScalene() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals("Scalene", t.getTriangleType());
    }

    @Test
    public void testEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        assertEquals("Equilateral", t.getTriangleType());
    }    

    @Test
    public void testIsoceles() {
        Triangle t1 = new Triangle(3, 3, 5);
        assertEquals("Isosceles", t1.getTriangleType());

        Triangle t2 = new Triangle(3, 5, 3);
        assertEquals("Isosceles", t2.getTriangleType());

        Triangle t3 = new Triangle(5, 3, 3);
        assertEquals("Isosceles", t3.getTriangleType());
    }

    @Test
    public void testNotTriangle1() {
        //TODO: add your test cases 
        Triangle t1 = new Triangle(3, 3, 90);
        assertEquals("Error: Not a triangle", t1.getTriangleType());

        Triangle t2 = new Triangle(3, 90, 3);
        assertEquals("Error: Not a triangle", t2.getTriangleType());

        Triangle t3 = new Triangle(90, 3, 2);
        assertEquals("Error: Not a triangle", t3.getTriangleType());

        
    }

    @Test
    public void sidesShouldBePositive() {
        //TODO: add your test cases 
        Triangle t1 = new Triangle(-3, 3, 5);
        assertEquals("Error: The length should be positive", t1.getTriangleType());

         Triangle t2 = new Triangle(3, -3, 5);
        assertEquals("Error: The length should be positive", t2.getTriangleType());

         Triangle t3 = new Triangle(3, 3, -5);
        assertEquals("Error: The length should be positive", t3.getTriangleType());
    }
}
