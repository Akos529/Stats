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
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int months = sales.length;
        return sum / months;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
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
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int months = sales.length;
        int average = sum / months;

        int monthsBelowAverage = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthsBelowAverage++;
            }
        }

        return monthsBelowAverage;
    }

    public int calcMonthsAboveAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int months = sales.length;
        int average = sum / months;

        int monthsAboveAverage = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthsAboveAverage++;
            }
        }

        return monthsAboveAverage;
    }
}
