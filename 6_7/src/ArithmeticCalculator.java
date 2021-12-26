public class ArithmeticCalculator {
    public int a;
    public int b;
    public int sum;
    public int multiply;
    public int subtract;

    public void numbers(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Operation type;

    public int calculate(int a, int b, Operation type) {
        if (type == Operation.ADD) {
            sum = a + b;
            return sum;
        } else if (type == Operation.MULTIPLY) {
            multiply = a * b;
            return multiply;
        } else if (type == Operation.SUBTRACT){
            subtract = a - b;
            return subtract;
        }

        return 0;
    }

    public void print(){
        System.out.println("Sum = " + sum + "\nMultiplication = " + multiply + "\nSubtraction = " + subtract);
    }
}
