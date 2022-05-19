package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldCalculateTotalSum() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = statsService.calculateTotalSum(sales);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateAverageSum() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = statsService.calculateAverageSum(sales);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldShowMinSalesMonthNumber() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = statsService.minSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldShowMaxSalesMonthNumber() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = statsService.maxSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateNumberOfMonthsSalesBelowAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = statsService.calcMonthsBelowAverage(sales);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateNumberOfMonthsSalesAboveAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = statsService.calcMonthsAboveAverage(sales);

        assertEquals(expected, actual);

    }
}
