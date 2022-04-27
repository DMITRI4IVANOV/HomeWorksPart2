package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    // 1.
    @Test
    void sholdCalcSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calcSum(sales);
        assertEquals(expected, actual);
    }

    //    2.
    @Test
    void sholdAveregeSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSum(sales);
        assertEquals(expected, actual);
    }

    // 3.
    @Test
    void sholdFindMaxSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    // 4.
//    1-й вариант
    @Test
    void sholdFindMinnSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinn(sales);
        assertEquals(expected, actual);
    }

    // Вариант из задания:
    @Test
    void sholdFindMinSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    //    5.
    @Test
    void sholdBelowAverege() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverege(sales);
        assertEquals(expected, actual);
    }

    // 6.
    @Test
    void sholdAboveAverege() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverege(sales);
        assertEquals(expected, actual);
    }
}
