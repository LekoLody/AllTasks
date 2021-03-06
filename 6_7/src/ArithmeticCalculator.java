public class ArithmeticCalculator {
    public int a;
    public int b;
    public int sum;
    public int multiply;
    public int subtract;

    public void numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Operation type;

    public int calculate(int a, int b, Operation type) {
        switch (type) {
            case ADD -> {
                sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
                return sum;
            }
            case MULTIPLY -> {
                multiply = a * b;
                System.out.println(a + " * " + b + " = " + multiply);
                return multiply;
            }
            case SUBTRACT -> {
                subtract = a - b;
                System.out.println(a + " - " + b + " = " + subtract);
                return subtract;
            }
        }
        return -1;
    }
}
