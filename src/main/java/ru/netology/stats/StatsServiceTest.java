package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class StatsServiceTest {

    @Test
    public void salesAmount() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 180;

        int actualSales = service.salesAmount(salesByMonth);
        //System.out.println(actualSales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmount = 15;

        int actualAverageAmount = service.averageAmount(salesByMonth);
        System.out.println(actualAverageAmount);
        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void MaxSales() {
        StatsService service = new StatsService();
        long[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;

        int actualMaxSales = service.maxSales(salesByMonth);
        System.out.println(actualMaxSales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void MinSales() {
        StatsService service = new StatsService();
        long[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;

        int actualMinSales = service.minSales(salesByMonth);
        System.out.println(actualMinSales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;

        int actualBelowAverage = service.monthsSalesBelowAverage(salesByMonth);
        System.out.println(actualBelowAverage);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void salesMaxAverage() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxAverage = 5;

        int actualMaxAverage = service.monthsSalesBelowAverage(salesByMonth);
        System.out.println(actualMaxAverage);
        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }

}
