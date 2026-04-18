package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class ArithmeticCalculatorTestNG {

    @Test(dataProvider = "additionCases")
    public void testAddition(int a, int b, int expected) {
        int result = ArithmeticCalculator.add(a, b);
        Assert.assertEquals(result, expected,
                "Сложение " + a + " и " + b + " должно дать " + expected);
    }

    @Test(dataProvider = "divisionCases")
    public void testDivision(int a, int b, double expected) {
        double result = ArithmeticCalculator.divide(a, b);
        Assert.assertEquals(result, expected, 0.001,
                "Деление " + a + " на " + b + " должно дать " + expected);
    }

    @Test(dataProvider = "divisionByZeroCases")
    public void testDivisionByZero(int a, int b) {
        Assert.expectThrows(
                "Деление на ноль невозможно",
                IllegalArgumentException.class,
                () -> ArithmeticCalculator.divide(a, b)
        );
    }

    @DataProvider(name = "additionCases")
    public Object[][] provideAdditionCases() {
        return new Object[][] {
                {2, 3, 5},
                {-1, 1, 0},
                {0, 0, 0},
                {100, -50, 50},
                {-10, -20, -30}
        };
    }

    @DataProvider(name = "divisionCases")
    public Object[][] provideDivisionCases() {
        return new Object[][] {
                {10, 2, 5.0},
                {7, 2, 3.5},
                {-6, 3, -2.0},
                {0, 5, 0.0},
                {9, -3, -3.0}
        };
    }

    @DataProvider(name = "divisionByZeroCases")
    public Object[][] provideDivisionByZeroCases() {
        return new Object[][] {
                {5, 0},
                {-10, 0},
                {0, 0}
        };
    }
}