package ru.netology.stats;

public class StatsService {
    // 1. Сумма всех продаж
    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
//            sum = sum + sale;
            sum += sale;
        }
//        Возвращаяем сумму
        return sum;
    }

    // 2.Средняя сумма продаж в месяц
    public long averageSum(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    // 3. Номер месяца, в котором был пик продаж
    public int findMax(int[] sales) {
        int maxMonth = 0;
        // переменная для индекса рассматриваемого месяца в массиве
        for (int month = 0; month < sales.length; month++) {
//            sales[maxMonth] - продажи в месяце maxMonth
//            sale - продажи в рассмативаемом месяце
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца, в котором был минимум продаж 1-й вариант:
    public int findMinn(long[] sales) {
        int minMonthh = 0;
        // переменная для индекса рассматриваемого месяца в массиве
        for (int month = 0; month < sales.length; month++) {
//            sales[maxMonth] - продажи в месяце maxMonth
//            sale - продажи в рассмативаемом месяце
            if (sales[month] <= sales[minMonthh]) {
                minMonthh = month;
            }
        }
        return minMonthh + 1;
    }

    // Вариант из домашнего задания
    public long findMin(long[] sales) {
        long minMonth = 0;
        long mont = 0; // переменная для индекса рассматриваемого месяца в массиве
        long currentMin = sales[0];
        for (long sale : sales) {
//            sales[minMonth] - продажи в месяце minMonth
//            sale - продажи в рассмативаемом месяце
            if (sale <= currentMin) {
                minMonth = mont;
            }
            mont = mont + 1; // следующий рассматриваемый месяц имеет номер на 1 болше
        }
        return minMonth + 1;
    }

    //    5. Кол-во месяцев, в которых продажи были ниже среднего
    public long belowAverege(long[] sales) {
        long sumMonth = 0;
        long monthBelow = 0;
        long averegeSale = averageSum(sales);
        for (long sale : sales) {
            if (sale < averegeSale) {
                sumMonth = sumMonth + 1;
            }
            monthBelow = monthBelow + 1;
        }
        return sumMonth;
    }

    //    6. Кол-во месяцев, в которых продажи были выше среднего
    public long aboveAverege(long[] sales) {
        long sumMonth = 0;
        long monthAbove = 0;
        long averegeSale = averageSum(sales);
        for (long sale : sales) {
            if (sale > averegeSale) {
                sumMonth = sumMonth + 1;
            }
            monthAbove = monthAbove + 1;
        }
        return sumMonth;
    }
}

