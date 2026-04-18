package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class NumberComparatorTestNG {

    @Test(dataProvider = "aGreaterThanB")
    public void testAGreaterThanB(int a, int b) {
        int result = NumberComparator.compare(a, b);
        Assert.assertEquals(result, 1,
                "Сравнение: " + a + " > " + b + " должно вернуть 1");
    }

    @Test(dataProvider = "aLessThanB")
    public void testALessThanB(int a, int b) {
        int result = NumberComparator.compare(a, b);
        Assert.assertEquals(result, -1,
                "Сравнение: " + a + " < " + b + " должно вернуть -1");
    }

    @Test(dataProvider = "aEqualsB")
    public void testAEqualsB(int a, int b) {
        int result = NumberComparator.compare(a, b);
        Assert.assertEquals(result, 0,
                "Сравнение: " + a + " == " + b + " должно вернуть 0");
    }

    @DataProvider(name = "aGreaterThanB")
    public Object[][] provideAGreaterThanB() {
        return new Object[][] {
                {5, 3},
                {10, 1},
                {0, -5},
                {-1, -3},
                {100, 50}
        };
    }

    @DataProvider(name = "aLessThanB")
    public Object[][] provideALessThanB() {
        return new Object[][] {
                {2, 8},
                {-5, 0},
                {-10, -7},
                {1, 100},
                {-100, -50}
        };
    }

    @DataProvider(name = "aEqualsB")
    public Object[][] provideAEqualsB() {
        return new Object[][] {
                {3, 3},
                {0, 0},
                {-5, -5},
                {100, 100},
                {-1000, -1000}
        };
    }
}