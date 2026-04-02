import java.util.Scanner;

class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();

        SimpleInterestCalculator obj = new SimpleInterestCalculator();
        double interest = obj.calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate " + rate +
                " and Time " + time);
    }
}
import java.util.Scanner;

class HandshakeCalculator {

    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        HandshakeCalculator obj = new HandshakeCalculator();
        int result = obj.calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + result);
    }
}
import java.util.Scanner;

class AthleteRunCalculator {

    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // meters (5 km)
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        AthleteRunCalculator obj = new AthleteRunCalculator();
        double rounds = obj.calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds required: " + rounds);
    }
}
import java.util.Scanner;

class NumberChecker {

    public int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        NumberChecker obj = new NumberChecker();
        int result = obj.checkNumber(number);

        if (result == 1)
            System.out.println("Positive Number");
        else if (result == -1)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
}
class SpringSeason {

    public boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||
            (month == 4 || month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        SpringSeason obj = new SpringSeason();

        if (obj.isSpringSeason(month, day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
import java.util.Scanner;

class NaturalNumberSum {

    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        NaturalNumberSum obj = new NaturalNumberSum();
        int sum = obj.calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
import java.util.Scanner;

class MinMaxFinder {

    public int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        MinMaxFinder obj = new MinMaxFinder();
        int[] result = obj.findSmallestAndLargest(a, b, c);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
import java.util.Scanner;

class DivisionCalculator {

    public int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        DivisionCalculator obj = new DivisionCalculator();
        int[] result = obj.findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
import java.util.Scanner;

class ChocolateDistribution {

    public int[] distributeChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter children: ");
        int children = scanner.nextInt();

        ChocolateDistribution obj = new ChocolateDistribution();
        int[] result = obj.distributeChocolates(chocolates, children);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
import java.util.Scanner;

class WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter wind speed: ");
        double speed = scanner.nextDouble();

        WindChillCalculator obj = new WindChillCalculator();
        double result = obj.calculateWindChill(temp, speed);

        System.out.println("Wind Chill Temperature: " + result);
    }
}
import java.util.Scanner;

class TrigonometricCalculator {

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        TrigonometricCalculator obj = new TrigonometricCalculator();
        double[] result = obj.calculateTrigonometricFunctions(angle);

        System.out.println("Sin: " + result[0]);
        System.out.println("Cos: " + result[1]);
        System.out.println("Tan: " + result[2]);
    }
}