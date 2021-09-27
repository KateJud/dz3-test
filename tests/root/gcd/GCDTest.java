package root.gcd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

//Катя Юдина 8_8 [классная работа будет чуть позже]
//Junit 5
class GCDTest {

    /* -------------------------- Простой тест --------------------------*/
    //Положительные значения аргументов
    @Test
    void gcdPositiveTest() {
        GCD gcd = new GCD();
        assertEquals(1, gcd.gcd(5, 6));
    }

    /* -------------------------- Отрицательные значения аргументов --------------------------*/

    //Отрицательное значение первого,
    @Test
    void gcdFirstNegativeTest() {
        GCD gcd = new GCD();
        assertEquals(1, gcd.gcd(-5, 6));
    }

    //Отрицательное значение второго
    @Test
    void gcdSecondNegativeTest() {
        GCD gcd = new GCD();
        assertEquals(1, gcd.gcd(5, -6));
    }

    //Отрицательное значение обоих аргументов
    @Test
    void gcdBothNegativeTest() {
        GCD gcd = new GCD();
        assertEquals(1, gcd.gcd(-5, -6));
    }

    /* -------------------------- Нулевые значения аргументов --------------------------*/

    //Нулевое значение первого
    //Второй отрицательный
    @Test
    void gcdFirstZeroTest() {
        GCD gcd = new GCD();
        assertEquals(6, gcd.gcd(0, -6));
    }

    //Нулевое значение второго
    //Первый положительный
    @Test
    void gcdSecondZeroTest() {
        GCD gcd = new GCD();
        assertEquals(5, gcd.gcd(5, 0));
    }

    //Нулевое значение обоих аргументов
    @Test
    void gcdBothZeroTest() {
        GCD gcd = new GCD();
        assertEquals(0, gcd.gcd(0, 0));
    }

    /* ------------------------------------------ Взаимно простые аргументы ------------------------------------------*/

    //Неединичные взаимно простые аргументы
    @Test
    void gcdSimpleNumbersTest() {
        GCD gcd = new GCD();
        assertEquals(1, gcd.gcd(17, 23));
    }

    /* ----------------------------------------------- Равные аргументы ----------------------------------------------*/

    //Равные значения аргументов
    @Test
    void gcdSameNumbersTest() {
        GCD gcd = new GCD();
        assertEquals(17, gcd.gcd(17, 17));
    }

    /* ------------------------------------ Неравные аргументы (один делится на другой) ------------------------------*/

    //Первый делит второй,
    @Test
    void gcdFirstDivTest() {
        GCD gcd = new GCD();
        assertEquals(4, gcd.gcd(40, 4));
    }

    // Второй делит первый
    @Test
    void gcdSecondDivTest() {
        GCD gcd = new GCD();
        assertEquals(5, gcd.gcd(5, 20));
    }

    /* ---------------------- Неравные аргументы (НОД отличный от нуля и от каждого из аругментов) -------------------*/

    // НОД отличный от нуля и от каждого из аругментов
    @Test
    void gcdSimpleTest() {
        GCD gcd = new GCD();
        assertEquals(40, gcd.gcd(80, 120));
    }

    /* ------------------------------------------------ Граничные значения -------------------------------------------*/

    //-2^31
    // Тестировать некорректно
    // а) Внутри метода 'x' и 'y' надо поменять на long и возвращаемое значение сделать long
    // Test  assertEquals((int)Math.pow(2,31),gcd.gcd((int)Math.pow(-2,31),(int)Math.pow(-2,31)));
    // б) ограничить нижнее значение -2^31+1
    //[я выбрала второй вариант]
//    @Test
//    void gcdMinArgTest() {
//        GCD gcd=new GCD();
//        assertEquals(4,gcd.gcd((int)Math.pow(-2,31),4));
//    }

    //Пишу тест для -2^31+1
    @Test
    void gcdMinArgTest() {
        GCD gcd = new GCD();
        assertEquals((int) (Math.pow(2, 31) - 1), gcd.gcd((int) (Math.pow(-2, 31) + 1), (int) (Math.pow(-2, 31) + 1)));
    }

    //2^31-1
    @Test
    void gcdMaxArgTest() {
        GCD gcd = new GCD();
        assertEquals(1, gcd.gcd(2, (int) (Math.pow(2, 31) - 1)));
    }

    /* ----------------------------------------------- Большие числа Фибоначчи ---------------------------------------*/

    //n=36 и n+1=37
    //14930352, 24157817
    @Test
    void gcdBigFibonacciTest() {
        GCD gcd = new GCD();
        assertEquals(1, gcd.gcd(14930352, 24157817));
    }

}