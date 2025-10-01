public class Main {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();

        Calc.setNumbers(10, 5);
        Calc.add();
        Calc.displayResult("+");
    }
}