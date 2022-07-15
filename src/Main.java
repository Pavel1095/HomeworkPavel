public class Main {

    public static void main(String[] args) {
        // Задание 1
        int apple = 1;
        byte orange = 5;
        short banana = 4;
        long pineapple = 10L;
        float appleWeight = 0.3f;
        double orangeWeight = 1.3;
        boolean orangeWeightEnough = orangeWeight > 1;
        System.out.println(orangeWeightEnough);
        char bar = 35;
        System.out.println(bar);

        // Задание 2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightOfAllBoxers = boxer1 + boxer2;
        float weightDifference = boxer2 - boxer1;
        System.out.println("Вес боксеров " + weightOfAllBoxers + "кг.");
        System.out.println("Разница в весе боксеров " + weightDifference + "кг.");

        // Задание 3
        byte bananaCount = 5;
        byte bananaWeightEach = 80;
        short milk100Ml = 2;
        short milkWeight100MlEach = 105;
        byte icecreamCount = 2;
        byte icecreamWeightEach = 100;
        byte eggsCount = 4;
        byte eggsWeightEach = 70;
        int allBananaWeight = bananaCount * bananaWeightEach;
        int allMilkWeight = milkWeight100MlEach * milk100Ml;
        int allIcecreamWeight = icecreamCount * icecreamWeightEach;
        int allEggsWeight = eggsWeightEach * eggsCount;
        int breakfastWeight = allBananaWeight + allEggsWeight + allIcecreamWeight + allMilkWeight;
        float breakfastWeightKg = breakfastWeight / 1000f;
        System.out.println("Вес завтрака составляет " + breakfastWeightKg +"кг.");

        // Задание 4
        short targetWeightLoss = 7000;
        short dietA = 250;
        short dietB = 500;
        byte average = 2;
        int daysDietA = targetWeightLoss / dietA;
        int daysDietB = targetWeightLoss / dietB;
        int averageDays = (daysDietA + daysDietB) / average;
        System.out.println("В среднем, спортсмену потребуется " + averageDays +"дн.");

        // Задание 5
        float promotion = 1.1f;
        byte monthsPerYear = 12;

        int maryPerMonth = 67760;
        double maryPerYear = maryPerMonth * monthsPerYear;
        double maryPerMonthPromoted = maryPerMonth * promotion;
        System.out.println("Маша теперь получает " + maryPerMonthPromoted + "руб. в месяц.");
        double maryPerYearPromoted = maryPerMonthPromoted * monthsPerYear;
        double maryDifferencePerYear = maryPerYearPromoted - maryPerYear;
        System.out.println("Годовой доход Маши вырос на " + maryDifferencePerYear + "руб.");

        int danPerMonth = 83690;
        double danPerYear = danPerMonth * monthsPerYear;
        double danPerMonthPromoted = danPerMonth * promotion;
        System.out.println("Денис тепрь получает " + danPerMonthPromoted + "руб. в месяц.");
        double danPerYearPromoted = danPerMonthPromoted * monthsPerYear;
        double danDifferencePerYear = danPerYearPromoted - danPerYear;
        System.out.println("Годовой доход Дениса вырос на " + danDifferencePerYear + "руб.");

        int crisPerMonth = 76230;
        double crisPerYear = crisPerMonth * monthsPerYear;
        double crisPerMonthPromoted = crisPerMonth * promotion;
        System.out.println("Кристина тепрь получает " + crisPerMonthPromoted + "руб. в месяц.");
        double crisPerYearPromoted = crisPerMonthPromoted * monthsPerYear;
        double crisDifferencePerYear = crisPerYearPromoted - crisPerYear;
        System.out.println("Годовой доход Кристины вырос на " + crisDifferencePerYear + "руб.");






    }
}