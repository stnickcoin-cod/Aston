package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class FactorialCalculatorTestNG {

    @Test(dataProvider = "validFactorialCases")
    public void testFactorialForValidInputs(int n, long expected) {
        long result = FactorialCalculator.calculateFactorial(n);
        Assert.assertEquals(result, expected,
                "Факториал числа " + n + " должен быть равен " + expected);
    }

    @Test(dataProvider = "negativeNumbers")
    public void testFactorialForNegativeInputs(int n) {
        Assert.expectThrows(
                "Факториал отрицательного числа не определён",
                IllegalArgumentException.class,
                () -> FactorialCalculator.calculateFactorial(n));
    }

    @Test(dataProvider = "edgeCases")
    public void testFactorialEdgeCases(int n, long expected) {
        long result = FactorialCalculator.calculateFactorial(n);
        Assert.assertEquals(result, expected,
                "Крайний случай: факториал числа " + n + " должен быть равен " + expected);
    }

    @DataProvider(name = "validFactorialCases")
    public Object[][] provideValidFactorialCases() {
        return new Object[][] {
                {2, 2L},
                {3, 6L},
                {4, 24L},
                {5, 120L},
                {6, 720L}
        };
    }

    @DataProvider(name = "negativeNumbers")
    public Object[][] provideNegativeNumbers() {
        return new Object[][] {
                {-1},
                {-5},
                {-10}
        };
    }

    @DataProvider(name = "edgeCases")
    public Object[][] provideEdgeCases() {
        return new Object[][] {
                {0, 1L},  // 0! = 1 по определению
                {1, 1L}   // 1! = 1
        };
    }
}
