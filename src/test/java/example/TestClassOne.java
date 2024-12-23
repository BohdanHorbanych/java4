package example;

import org.testng.annotations.*;

public class TestClassOne {

    @BeforeClass(groups = "setup")
    public void setUpClass() {
        System.out.println("setUpClass");
    }

    @AfterClass(groups = "teardown")
    public void tearDownClass() {
        System.out.println("tearDownClass");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("setUpMethod");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("tearDownMethod");
    }

    @Test(groups = "group1")
    public void testGroup1() {
        System.out.println("Test in group1");
    }

    @Test(groups = "group2")
    public void testGroup2() {
        System.out.println("Test in group2");
    }

    @Test(groups = {"group1", "group2"})
    public void testGroup1And2() {
        System.out.println("Test in group1 and group2");
    }
}

