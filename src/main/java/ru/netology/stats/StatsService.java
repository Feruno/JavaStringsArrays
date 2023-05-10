package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] sales) {
        int salesAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            salesAmount += sales[i];
        }
        return salesAmount;
    }

    public int averageAmount(int[] sales) {
        int averageAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            averageAmount += sales[i];
        }
        averageAmount = averageAmount / sales.length;
        return averageAmount;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthsSalesBelowAverage(int[] sales) {
        int countMinAverage = 0;
        int minAverage = averageAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minAverage) {
                countMinAverage++;
            }
        }
        return countMinAverage;
    }

    public int monthsSalesMaxAverage(int[] sales) {
        int countMaxAverage = 0;
        int maxAverage = averageAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxAverage) {
                countMaxAverage++;
            }
        }
        return countMaxAverage;
    }
}
