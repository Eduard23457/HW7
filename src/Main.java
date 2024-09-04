public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int mount = 0;
        for (; total < 2_459_000; mount += 1) {
            total = salary + total + (total / 100);
        }
        System.out.println("Месяц " + mount + " сумма накоплений равна " + total + " рублей");

        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        int b = 10;
        for (; b >= 1; ) {
            System.out.print(b + " ");
            b--;
        }

        System.out.println("Задача 3");
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birth = 17 * population / 1000;
            int dead = 8 * population / 1000;
            population = population + birth - dead;
            System.out.println("Год " + year + " численность населения составляет" + population);
        }
        System.out.println("Задача 4");
        int year1 = 0;
        int sum = 15_000;
        total = 0;
        int percent = 15_000 * 7 / 100;
        while (total < 12_000_000) {
            year1 = year1 + 1;
            sum = sum + percent;
            total = total + sum;
            System.out.println("Месяц " + year1 + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 5");
        int year2 = 0;
        int sum1 = 15_000;
        total = 0;
        int percent1 = 15_000 * 7 / 100;
        while (total < 12_000_000) {
            year2++;
            sum1 = sum1 + percent1;
            total = total + sum1;
            if (year2 % 6 == 0) {
                System.out.println("Месяц " + year2 + " сумма накоплений равна " + total + " рублей");
            }

            System.out.println("Задача 6");
            int depositAmount = 15000;
            double monthlyPercent = 0.07;
            int purpose = 9 * 12;
            int count = 1;
            while (count <= purpose) {
                depositAmount += depositAmount * monthlyPercent;
                if (count % 6 == 0) {
                    System.out.println("Месяц " + count + " сумма накоплений " + depositAmount);
                }
                count++;
            }
            System.out.println("Задача 7");
            int friday = 1;
            while (friday <= 31) {
                System.out.println("Сегодня пятница " + friday + " - е число. Необходимо подготовить отчет ");
                friday += 7;
            }
            System.out.println("Задача 8");
            int yearBefore = 2024 - 200;
            int yearAfter = 2024 + 100;
            int count2 = 0;
            for (year2 = yearBefore; year2 < yearAfter; year2++) {
                if (year2 % 79 == 0) {
                    System.out.println(year2);
                }

            }
        }
    }
}



