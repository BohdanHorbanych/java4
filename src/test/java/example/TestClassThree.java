package example;

import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 3)
    public void testThree() {
        System.out.println("Test Three");
    }

    @Test(priority = 2)
    public void testTwo() {
        System.out.println("Test Two");
    }

    @Test(priority = 1)
    public void testOne() {
        System.out.println("Test One");
    }
}
