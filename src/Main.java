public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Лабораторна робота №2");
        System.out.println("Тема: Оператори та типи даних");
        System.out.println("Виконав: студент Курбатов");
        System.out.println("Варіант: 8");
        System.out.println("========================================\n");

        // ----------------------------------------------------
        // Завдання 1 (Вираз №22 з таблиці 2)
        // Формула: y = (4 * sh(sqrt(|a / sqrt(|b|)|)) + 3 * arcsin(c))^d
        // ----------------------------------------------------
        double a1 = 1.23;
        double b1 = -0.34;
        double c1 = 0.707;
        double d1 = 2.312;

        // Рахуємо крок за кроком
        double inner1 = Math.sqrt(Math.abs(a1 / Math.sqrt(Math.abs(b1))));
        double y1 = Math.pow(4 * Math.sinh(inner1) + 3 * Math.asin(c1), d1);

        System.out.println("--- Завдання 1 (Вираз 22) ---");
        System.out.println("Вхідні дані: a = " + a1 + ", b = " + b1 + ", c = " + c1 + ", d = " + d1);
        System.out.println("Результат y = " + y1);
        System.out.println();

        // ----------------------------------------------------
        // Завдання 2 (Вираз №23 з таблиці 2)
        // Формула: y = (5 * c) / cos(a) + sqrt(sh(|b * c|) / tg(d))
        // ----------------------------------------------------
        double a2 = -3.45;
        double b2 = -2.34;
        double c2 = 1.45;
        double d2 = 0.83;

        double partA = (5 * c2) / Math.cos(a2);
        double partB = Math.sqrt(Math.sinh(Math.abs(b2 * c2)) / Math.tan(d2));
        double y2 = partA + partB;

        System.out.println("--- Завдання 2 (Вираз 23) ---");
        System.out.println("Вхідні дані: a = " + a2 + ", b = " + b2 + ", c = " + c2 + ", d = " + d2);
        System.out.println("Результат y = " + y2);
        System.out.println();

        // ----------------------------------------------------
        // Завдання 3 (Вираз №24 з таблиці 2)
        // Формула: y = (cos(b) + sin(sqrt(a))) / (2 * lg(c) + e^d)
        // ----------------------------------------------------
        double a3 = 0.345;
        double b3 = -2.25;
        double c3 = 2.65;
        double d3 = 3.99;

        // lg - це десятковий логарифм log10
        double numerator = Math.cos(b3) + Math.sin(Math.sqrt(a3));
        double denominator = 2 * Math.log10(c3) + Math.exp(d3);
        double y3 = numerator / denominator;

        System.out.println("--- Завдання 3 (Вираз 24) ---");
        System.out.println("Вхідні дані: a = " + a3 + ", b = " + b3 + ", c = " + c3 + ", d = " + d3);
        System.out.println("Результат y = " + y3);
        System.out.println();

        // ----------------------------------------------------
        // Демонстрація коду з контрольних питань (№8, №12, №16)
        // ----------------------------------------------------
        System.out.println("========================================");
        System.out.println("Перевірка фрагментів коду з контрольних питань");
        System.out.println("========================================");

        // Питання 8
        System.out.println("\nКод з питання 8 (переповнення int):");
        int numA = 2_000_000_000;
        int numB = 2_000_000_000;
        int sum = numA + numB;
        System.out.println("numA + numB = " + sum);

        // Питання 12
        System.out.println("\nКод з питання 12 (порівняння Double.NaN):");
        System.out.println("Double.NaN == Double.NaN -> " + (Double.NaN == Double.NaN));

        // Питання 16
        System.out.println("\nКод з питання 16 (логічні оператори та присвоєння):");
        boolean a = true && false | false;
        System.out.println("System.out.println(a = false): " + (a = false));

        boolean b = true && false || false;
        System.out.println("System.out.println(b = true): " + (b = true));
    }
}
