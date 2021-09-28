package root.sqrt;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Junit 5
class AdvSqrtTest {
    private static double EPS = 2.25e-14;
    private static AdvSqrt advSqrt;

    @BeforeAll
    private static void init() {
        advSqrt = new AdvSqrt();
    }

    /* ----------------------------------------------- 1. Простой тест
    --------------------------------------------------*/

    //Sqrt
    @Test
    void sqrtSimpleTest() {
        Assert.assertEquals(8, advSqrt.sqrt(64), EPS);
    }

    @Test
    void sqrtSimpleRoundTest() {

        Assert.assertEquals(Math.sqrt(288), advSqrt.sqrt(288), EPS);
    }

    @Test
    void sqrtSimpleRound2Test() {

        //16**2= 256
        //17**2 = 289
        Assert.assertEquals(Math.sqrt(290), advSqrt.sqrt(290), EPS);
    }

    /* ----------------------------------------------- 2. Отрицательный аргумент
    --------------------------------------------------*/

    //Sqrt (Отрицательное число) -> Nan
    @Test
    void sqrtNegativeTest() {
        Assert.assertEquals("Sqrt(-|x|) has to be Nan", Double.NaN, advSqrt.sqrt(-5), EPS);
    }

    //Sqrt (Отрицательное число) -> Nan
    @Test
    void sqrtNegativeInfTest() {
        Assert.assertEquals("Sqrt(-|x|) has to be Nan", Double.NaN, advSqrt.sqrt(Double.NEGATIVE_INFINITY), EPS);
    }

    /* ----------------------------------------------- Нулевой аргумент
    --------------------------------------------------*/

    //Результатом вычисления sqrt с аргументом 0 должен быть 0
    @Test
    void sqrtZeroTest() {
        Assert.assertEquals("Sqrt(0) has to be 0", 0, advSqrt.sqrt(0), EPS);
    }

    //+0
    @Test
    void sqrtPositiveZeroTest() {
        Assert.assertEquals("Sqrt(0) has to be 0", 0, advSqrt.sqrt(0), EPS);
    }

    //-0
    @Test
    void sqrtNegativeZeroTest() {
        Assert.assertEquals("Sqrt(-0) has to be -0", -0, advSqrt.sqrt(-0), EPS);
    }



    /* ----------------------------------------------- 4. +Inf --------------------------------------------------*/

    //+Inf
    @Test
    void sqrtPositiveInfTest() {
        Assert.assertEquals("Sqrt(+Inf) has to be +Inf", Double.POSITIVE_INFINITY,
                advSqrt.sqrt(Double.POSITIVE_INFINITY), EPS);
    }

    /* ----------------------------------------------- 5. NAN --------------------------------------------------*/

    //Nan
    @Test
    void sqrtNanTest() {
        Assert.assertEquals("Sqrt(Nan) has to be Nan", Double.NaN, advSqrt.sqrt(Double.NaN), EPS);
    }

}