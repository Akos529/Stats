package ru.netology.stats;

public class StatsService {

    public int calculateTotalSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSum(int[] sales) {
        int sum = calculateTotalSum(sales);
        int months = sales.length;
        return sum / months;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calcMonthsBelowAverage(int[] sales) {
        int average = calculateAverageSum(sales);
        int monthsBelowAverage = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthsBelowAverage++;
            }
        }

        return monthsBelowAverage;
    }

    public int calcMonthsAboveAverage(int[] sales) {
        int average = calculateAverageSum(sales);
        int monthsAboveAverage = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthsAboveAverage++;
            }
        }

        return monthsAboveAverage;
    }
}
