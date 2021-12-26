import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        arithmeticCalculator.numbers(4, 4);
        System.out.println(arithmeticCalculator.calculate(1, 1, Operation.ADD));
        System.out.println(arithmeticCalculator.calculate(1, 1, Operation.MULTIPLY));
        System.out.println(arithmeticCalculator.calculate(1, 1, Operation.SUBTRACT));
        arithmeticCalculator.print();
    }
}
