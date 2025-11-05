public class Main {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();

        Calc.setNumbers(10, 5);
        Calc.add();
        Calc.displayResult("+");

        Calc.subtract();
        Calc.displayResult("-");

        AdvancedCalculator advancedCalc = new AdvancedCalculator();

        advancedCalc.setNumbers(20, 7);
        advancedCalc.multiply();
        advancedCalc.displayResult("*");

        advancedCalc.setNumbers(9, 3);
        advancedCalc.divide();
        advancedCalc.displayResult("/");

        ScientificCalculator Scic = new ScientificCalculator();

        Scic.setNumbers(2 , 10);
        Scic.Square();
        Scic.displayResult("^");

        Factorial Fac = new Factorial();

        Fac.setNumbers(5);
        Fac.factorial();
        Fac.displayResult("!");
    }
}