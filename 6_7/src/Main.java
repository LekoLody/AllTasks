import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        do
        arithmeticCalculator.calculate(in.nextInt(),
                in.nextInt(),
                Operation.valueOf(in.next()));
        while (in.nextInt() != 0);
    }
}
