public class Main {

    public static void main(String[] args) {
        //Задание 1
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

        //Задание 2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightOfAllBoxers = boxer1 + boxer2;
        float weightDifference = boxer2 - boxer1;
        System.out.println("Вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

    }
}